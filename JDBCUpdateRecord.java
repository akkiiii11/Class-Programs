package com.JDBCProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUpdateRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");
		
		PreparedStatement ps = con.prepareStatement("Update emp set salary=50000 where empid = 3");
		
		ps.execute();
		
		System.out.println("Employee Record Updated Successfully...!!!");
		

	}

}
