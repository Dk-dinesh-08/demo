package com.jdbc;
import java.sql.*;
public class JdbcDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://DATABASE";
		try {
			Connection con= DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());

		}
	}

}
