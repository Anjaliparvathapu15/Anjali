package com.jdbc.parctice;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Daoimp implements DaoInf {
	Connection con=DaoClass.getConnection();
	@Override
	public boolean addStudent(ModelClass m) {
		try {
			PreparedStatement pos=con.prepareStatement("insert into ModelClass(id,name,email)values(?,?,?)");
			pos.setInt(1, m.getId());
			pos.setString(2, m.getName());
			pos.setString(3, m.getEmail());
//			return pos.executeUpdate()>0;
			int rows=pos.executeUpdate();
			return rows>0;
		}catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}

}
