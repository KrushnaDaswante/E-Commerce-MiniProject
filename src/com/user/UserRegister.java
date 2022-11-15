package com.user;

import com.connectivity.*;
import java.util.*;
import java.sql.*;

public class UserRegister {
	Connection con = null;
	PreparedStatement ps = null;

	public void saveUser(String name , String email_id ,String mobile,String address,String username ,String password) {
		try {
			DatabaseCon db = new DatabaseCon();

			con = db.getConnection();

			ps = con.prepareStatement(
					"insert into user(u_name,u_email_id,mobile,address,username , password) values(?,?,?,?,?,?)");

			ps.setString(1, name);
			ps.setString(2, email_id);
			ps.setString(3, mobile);
			ps.setString(4, address);
			ps.setString(5, username);
			ps.setString(6, password);
			
			int i = ps.executeUpdate();
			
			System.out.println(i + " Record inserted successfully ..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void newUserRegister() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Your name: ");

		String name = scanner.next();

		System.out.print("Enter Your Email ID : ");
		String email = scanner.next();

		System.out.print("Enter your mobile number : ");
		String mobile = scanner.next();

		System.out.print("Enter Your Address: ");
		String address = scanner.next();

		System.out.print("Enter Your Username: ");
		String userName = scanner.next();

		System.out.print("Enter Your Password : ");
		String password = scanner.next();

		this.saveUser(name, email, mobile, address, userName, password);
	}
	
	public void getUserDetails() {
		try {
		
		DatabaseCon db = new DatabaseCon();
		
		con = db.getConnection();
		
		ps = con.prepareStatement("select * from user");
		
		ResultSet rs =ps.executeQuery();
		System.out.printf("                                                                       USERS DETAILS        \n");
		System.out.println();
		System.out.println();
		System.out.printf("| %-8s | %-16s | %-35s |%-15s  |%-20s |%-20s | %-20s  |%n", "ID","Name", "Email ID", "Mobile NO", "Username", "Password", "Address");
		System.out.printf("--------------------------------------------------------------------------------------------------------------------------------------------------------\n");
		while(rs.next()) {
			
		
			System.out.printf("| %-8s | %-16s | %-35s |%-15s  |%-20s |%-20s | %-20s  |%n", rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
		}
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
		
		
	}


