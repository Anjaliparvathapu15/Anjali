package com.exceptionhandling;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Test5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class Loaded Successfully");
		con=DriverManager.getConnection("jdbc:Mysql://localhost:3306/anjali","root","root");
		System.out.println("Connection Established");
		st=con.createStatement();
		String sql="Select * from employee";
		 rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println("****************");
		}
		}
		finally {
			rs.close();
			st.close();
			con.close();
		}

	}

}
