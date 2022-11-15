package com.admin;
import com.mainclass.*;
import java.sql.Connection;
import java.util.Scanner;


import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connectivity.DatabaseCon;

public class AdminClass {

	public boolean adminLogin(String userName, String password) {

		boolean flag = false;

		PreparedStatement statement = null;
		Connection connection = null;

		DatabaseCon dbc = new DatabaseCon();

		try {

			connection = dbc.getConnection();

			statement = connection.prepareStatement("select  * from admin where username = ? and password=? ");

			statement.setString(1, userName);
			statement.setString(2, password);

			ResultSet rs = statement.executeQuery();

			if (rs.next()) {

				flag = true;

			} else {
				System.out.println("Invalid Admin..");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public void addProductIntoDatabase() {
		Scanner scanner = new Scanner(System.in);
		SetData set = new SetData();
		
		System.out.print("Enter how many Product do you want to Save :");
		
		
		int num = scanner.nextInt();
		for(int i = 1 ;i<=num;i++) {
			set.productInfo();
		}
		

	}

}
