package com.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Driver is loaded");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

			System.out.println("Connection is created");

			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the title");
			String title = scan.nextLine();
			
			System.out.println("Enter the id");
			String id = scan.nextLine();

			String s = "update posts set title=? where id=? ";
			
			PreparedStatement pst = con.prepareStatement(s);
			pst.setString(1, title);
			pst.setString(2, id);
			int i = pst.executeUpdate();
			
			System.out.println("Rows affected : " + i);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}