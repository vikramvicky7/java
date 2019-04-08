package com.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Driver is loaded");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

			System.out.println("Connection is created");

			Scanner scan = new Scanner(System.in);

			System.out.println("Enter the id");
			String id = scan.nextLine();

			String q = "delete from posts where id=?";

			PreparedStatement pst = con.prepareStatement(q);
			pst.setString(1, id);
			int i = pst.executeUpdate();

			System.out.println("Rows affected : " + i);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
