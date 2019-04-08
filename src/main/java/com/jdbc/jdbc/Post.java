package com.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Post {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Driver is loaded");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

			System.out.println("Connection is created");

			Statement st = con.createStatement();

//			String q = "insert into posts(title,body) values('first post','facebook post')";
			String q = "delete from posts where id=4";
			int i = st.executeUpdate(q);

			System.out.println("Rows affected : " + i);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}
}
