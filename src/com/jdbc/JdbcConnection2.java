package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcConnection2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anjali","root","root");
			PreparedStatement pos=con.prepareStatement("insert into customer(custno,custName)values(?,?)");
			pos.setInt(1, 3);
			pos.setString(2, "teja");
			int n=pos.executeUpdate();
			if(n>0) {
				System.out.println(n+" rows effected");
			}else {
				System.out.println("Something went wrong");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
class Connection1{
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306:/anjali","root","root");
			PreparedStatement pos=con.prepareStatement("insert into customer(custno,custname)values()?,?");
			pos.setInt(1, 201);
			pos.setString(2, "Vinay");
			int n=pos.executeUpdate();
			if(n>0) {
				System.out.println(n+"rows effected");
			}else {
				System.out.println("somethong went wrong !!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
