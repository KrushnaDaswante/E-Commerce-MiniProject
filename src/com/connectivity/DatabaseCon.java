package com.connectivity;
import java.sql.*;


public class DatabaseCon {
	
	Connection con = null;
	
	public Connection getConnection() {
		
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdatabase","root","root");
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	

}
