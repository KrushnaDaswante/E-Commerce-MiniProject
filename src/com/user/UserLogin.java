package com.user;

import com.connectivity.*;
import java.sql.*;

public class UserLogin {

	public boolean userLogin(String userName, String password) {
		
		boolean flag = false;

		PreparedStatement statement = null;
		Connection connection = null;

		DatabaseCon dbc = new DatabaseCon();

		try {

			connection = dbc.getConnection();

			statement = connection.prepareStatement("select  * from user where username = ? and password=? ");

			statement.setString(1, userName);
			statement.setString(2, password);

			ResultSet rs = statement.executeQuery();
			
			if(rs.next()) {
				
				flag=true;
			
			}
			else
			{
				System.out.println("Invalid user..");
				
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
