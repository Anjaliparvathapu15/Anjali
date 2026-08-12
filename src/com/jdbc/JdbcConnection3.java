package com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class JdbcConnection3 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pos=null;
		try {
			con=Connectionclass.getConnection();
			pos=con.prepareStatement("select * from customer where custName=?");
			pos.setString(1,"Anjali");
			ResultSet ros= pos.executeQuery();
			while(ros.next()) {
				System.out.println(ros.getInt(1)+" "+ros.getString(2));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
