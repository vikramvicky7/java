package com.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
			System.out.println("Connection is created");

			Scanner scan = new Scanner(System.in);

			System.out.println("Enter the title");
			String title = scan.nextLine();

			System.out.println("Enter the Body");
			String body = scan.nextLine();

			String sq = "insert into posts(title,body) values(?,?)";

			PreparedStatement pst = con.prepareStatement(sq);
			pst.setString(1, title);
			pst.setString(2, body);
			int i = pst.executeUpdate();

			System.out.println("Rows affected : " + i);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}