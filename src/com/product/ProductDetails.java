package com.product;
import com.connectivity.*;

import java.util.*;
import java.sql.*;




public class ProductDetails implements Product {
	int id;
	String name;
	String description;
	int price;
	int quantity;
	
	/*ProductDetails(int id, String name,String description, int price, int quantity){
		this.id= id;
		this.name=name;
		this.description= description;
		this.price= price;
		this.quantity = quantity;
		
		
	}*/
	DatabaseCon db = new DatabaseCon();
	
	Connection con = null;
	PreparedStatement ps = null;
	
	
	
	public void setProduct(String p_name , String description ,int price , int quantity){
		try {
		con =  db.getConnection();
		
		ps = con.prepareStatement("insert into product(p_name , description, price, quantity) values(?,?,?,?)");
		
		ps.setString(1, p_name);
		ps.setString(2, description);
		ps.setInt(3, price);
		ps.setInt(4, quantity);
		
		int i =ps.executeUpdate();
		
		System.out.println(i +" Record inserted successfully...");
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		{
	}
		
		
		
		
		
		
	}
	
	public void getProduct() {
		try {
		
		DatabaseCon db = new DatabaseCon();
		
		con = db.getConnection();
		
		ps = con.prepareStatement("select * from product");
		
		ResultSet rs =ps.executeQuery();
		
		System.out.printf("                                   PRODUCT DETAILS        \n");
		System.out.println();
		System.out.println();
		System.out.printf("| %-8s | %-16s | %-35s |%-10s  |%-10s  |%n", "ID","Product Name","Description","Price","Quantity");
		System.out.printf("-------------------------------------------------------------------------------------------\n");
		while(rs.next()) {
			
		//	System.out.println("ID : "+ rs.getInt(1)+ "  Product Name : "+rs.getString(2)+"   Description: "+rs.getString(3)+"    Price : "+rs.getInt(4)+"   Quantity : "+rs.getInt(5));

			System.out.printf("| %-8s | %-16s | %-35s |%-10s  |%-10s  |%n", rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
			
			
		}
		
		
		
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
