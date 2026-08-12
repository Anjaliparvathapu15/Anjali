package com.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class JdbcConnection1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anjali","root","root");
			Statement s1 = con.createStatement();
			String s="insert into customer (custno,custname) values(1,'Anjali')";
			int n=s1.executeUpdate(s);
			if(n>0) {
				System.out.println(n+" rows effected");
			}else {
				System.out.println("Something went wrong!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
