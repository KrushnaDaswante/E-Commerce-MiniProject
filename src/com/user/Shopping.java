package com.user;

import java.sql.*;
import com.mainclass.*;

import java.util.*;

import com.connectivity.*;


public class Shopping {
	TestMain testMain = new TestMain();

	int userId = this.getUserId(MainUserClass.userName, MainUserClass.password);
    
	public void setOrder(int productId, int userId, int items, String name, int price) {

		Connection con = null;
		PreparedStatement statement = null;
		DatabaseCon dbc = new DatabaseCon();

		try {

			con = dbc.getConnection();

			statement = con.prepareStatement("insert into orderinfo(p_id,u_id,items,p_name,price) values (?,?,?,?,?)");

			statement.setInt(1, productId);
			statement.setInt(2, userId);
			statement.setInt(3, items);
			statement.setString(4, name);
			statement.setInt(5, price);
			statement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void selectProduct() {
		Scanner scanner = new Scanner(System.in);
		int productId;
		int userId = this.getUserId(MainUserClass.userName, MainUserClass.password);
		String mobile = this.getuserMobile(userId);

		int items;
		boolean flag = false;
		do {
			System.out.print("Enter Product id which you want add to cart.");
			productId = scanner.nextInt();
			String name = this.getProductName(productId);
			int price = this.getPrice(productId);
			String userName = this.getuserName(userId);
		//	String mobile = this.getuserMobile(userId);
			String address = this.getuserAddress(userId);

			switch (productId) {

			case 1: {

				System.out.print("Enter quantity : ");
				items = scanner.nextInt();
				int total = price * items;

				this.setOrder(productId, userId, items, name, price);
				this.bills(userName, mobile, address, productId, name, price, total);
				//this.updateBills(userName, mobile, address, productId, name, price, total);
				System.out.print("Do you want to add more product: Y/N ");
				char ch = scanner.next().charAt(0);

				if (ch == 'Y' || ch == 'y') {
					flag = true;
					break;
				} else if (ch == 'N' || ch == 'n') {
					flag = false;

				}

			}
				break;

			case 2: {

				System.out.print("Enter quantity : ");
				items = scanner.nextInt();
				int total = price * items;

				this.setOrder(productId, userId, items, name, price);
				this.bills(userName, mobile, address, productId, name, price, total);
			//	this.updateBills(userName, mobile, address, productId, name, price, total);
				System.out.print("Do you want to add more product: Y/N ");
				char ch = scanner.next().charAt(0);

				if (ch == 'Y' || ch == 'y') {
					flag = true;
					break;
				} else if (ch == 'N' || ch == 'n') {
					flag = false;

				}

			}

				break;
			case 3: {

				System.out.print("Enter quantity : ");
				items = scanner.nextInt();
				int total = price * items;

				this.setOrder(productId, userId, items, name, price);
				this.bills(userName, mobile, address, productId, name, price, total);
			//	this.updateBills(userName, mobile, address, productId, name, price, total);
				System.out.print("Do you want to add more product: Y/N ");
				char ch = scanner.next().charAt(0);

				if (ch == 'Y' || ch == 'y') {
					flag = true;
					break;
				} else if (ch == 'N' || ch == 'n') {
					flag = false;

				}

			}
				break;

			case 4: {

				System.out.print("Enter quantity : ");
				items = scanner.nextInt();
				int total = price * items;

				this.setOrder(productId, userId, items, name, price);
				this.bills(userName, mobile, address, productId, name, price, total);
				//this.updateBills(userName, mobile, address, productId, name, price, total);
				System.out.print("Do you want to add more product: Y/N ");
				char ch = scanner.next().charAt(0);

				if (ch == 'Y' || ch == 'y') {
					flag = true;
					break;
				} else if (ch == 'N' || ch == 'n') {
					flag = false;

				}

			}
				break;
			case 5: {

				System.out.print("Enter quantity : ");
				items = scanner.nextInt();
				int total = price * items;

				this.setOrder(productId, userId, items, name, price);
				this.bills(userName, mobile, address, productId, name, price, total);
			//	this.updateBills(userName, mobile, address, productId, name, price, total);
				System.out.print("Do you want to add more product: Y/N ");
				char ch = scanner.next().charAt(0);

				if (ch == 'Y' || ch == 'y') {
					flag = true;
					break;
				} else if (ch == 'N' || ch == 'n') {
					flag = false;

				}

			}
				break;
			case 6: {

				System.out.print("Enter quantity : ");
				items = scanner.nextInt();
				int total = price * items;

				this.setOrder(productId, userId, items, name, price);
				this.bills(userName, mobile, address, productId, name, price, total);
			//	this.updateBills(userName, mobile, address, productId, name, price, total);
				System.out.print("Do you want to add more product: Y/N ");
				char ch = scanner.next().charAt(0);

				if (ch == 'Y' || ch == 'y') {
					flag = true;
					break;
				} else if (ch == 'N' || ch == 'n') {
					flag = false;

				}

			}
				break;
			case 7: {

				System.out.print("Enter quantity : ");
				items = scanner.nextInt();
				int total = price * items;

				this.setOrder(productId, userId, items, name, price);
				this.bills(userName, mobile, address, productId, name, price, total);
			//	this.updateBills(userName, mobile, address, productId, name, price, total);
				System.out.print("Do you want to add more product: Y/N ");
				char ch = scanner.next().charAt(0);

				if (ch == 'Y' || ch == 'y') {
					flag = true;
					break;
				} else if (ch == 'N' || ch == 'n') {
					flag = false;

				}

			}
				break;
			case 8: {

				System.out.print("Enter quantity : ");
				items = scanner.nextInt();
				int total = price * items;

				this.setOrder(productId, userId, items, name, price);
			//	this.bills(userName, mobile, address, productId, name, price, total);
				this.updateBills(userName, mobile, address, productId, name, price, total);
				System.out.print("Do you want to add more product: Y/N ");
				char ch = scanner.next().charAt(0);

				if (ch == 'Y' || ch == 'y') {
					flag = true;
					break;
				} else if (ch == 'N' || ch == 'n') {
					flag = false;

				}

			}
				break;
			case 9: {

				System.out.print("Enter quantity : ");
				items = scanner.nextInt();
				int total = price * items;

				this.setOrder(productId, userId, items, name, price);
				this.bills(userName, mobile, address, productId, name, price, total);
		//		this.updateBills(userName, mobile, address, productId, name, price, total);
				System.out.print("Do you want to add more product: Y/N ");
				char ch = scanner.next().charAt(0);

				if (ch == 'Y' || ch == 'y') {
					flag = true;
					break;
				} else if (ch == 'N' || ch == 'n') {
					flag = false;

				}

			}
				break;
			case 10: {

				System.out.print("Enter quantity : ");
				items = scanner.nextInt();
				int total = price * items;

				this.setOrder(productId, userId, items, name, price);
				this.bills(userName, mobile, address, productId, name, price, total);
			//	this.updateBills(userName, mobile, address, productId, name, price, total);
				System.out.print("Do you want to add more product: Y/N ");
				char ch = scanner.next().charAt(0);

				if (ch == 'Y' || ch == 'y') {
					flag = true;
					break;
				} else if (ch == 'N' || ch == 'n') {
					flag = false;

				}

			}
				break;

			default:
				flag = true;
				System.out.println("Invalid input. please try again");
				break;

			}
		} while (flag == true);
		this.generateBill( mobile);
		
		System.out.println("1. Go to Home Page");
		System.out.println("2. Exit");
		int num = scanner.nextInt();
		switch(num) {
		
		case 1: testMain.main(null);
		case 2 : System.exit(2);
		default:
			System.out.println("invalid input..");
			
		}
		scanner.close();
	}

	public int getUserId(String name, String password) {

		Connection con = null;
		int result = 0;
		PreparedStatement statement = null;
		DatabaseCon dbc = new DatabaseCon();

		try {

			con = dbc.getConnection();

			statement = con.prepareStatement("select u_id from user where username = ? and password = ?");

			statement.setString(1, name);
			statement.setString(2, password);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				result = rs.getInt(1);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

	public String getProductName(int id) {

		Connection con = null;
		String result = null;
		PreparedStatement statement = null;
		DatabaseCon dbc = new DatabaseCon();

		try {

			con = dbc.getConnection();

			statement = con.prepareStatement("select p_name from product where p_id = ?");

			statement.setInt(1, id);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				result = rs.getString(1);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

	public int getPrice(int id) {

		Connection con = null;
		int result = 0;
		PreparedStatement statement = null;
		DatabaseCon dbc = new DatabaseCon();

		try {

			con = dbc.getConnection();

			statement = con.prepareStatement("select price from product  where p_id=?");

			statement.setInt(1, id);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				result = rs.getInt(1);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

	public void bills(String userName, String mobile, String address, int productId, String productName, int price,
			int total) {

		Connection con = null;
	//	String result = null;
		PreparedStatement statement = null;
		DatabaseCon dbc = new DatabaseCon();

		
		
		try {

			con = dbc.getConnection();

			statement = con.prepareStatement(
					"insert into bill (customer_name , mobile_no , address, p_id,p_name,price,total) values (?,?,?,?,?,?,?)");

			statement.setString(1, userName);
			statement.setString(2, mobile);
			statement.setString(3, address);
			statement.setInt(4, productId);
			statement.setString(5, productName);
			statement.setInt(6, price);
			statement.setInt(7, total);
			statement.executeUpdate();

			// System.out.println(i +" Record inserted successfully...");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateBills(String userName, String mobile, String address, int productId, String productName,
			int price, int total) {

		Connection con = null;
	//	String result = null;
		PreparedStatement statement = null;
		DatabaseCon dbc = new DatabaseCon();

		try {

			con = dbc.getConnection();

			statement = con.prepareStatement(
					"update bill set customer_name = ? , mobile_no =?, address=?, p_id =? ,p_name=?,price=?,total=? where mobile_no =?");

			statement.setString(1, userName);
			statement.setString(2, mobile);
			statement.setString(3, address);
			statement.setInt(4, productId);
			statement.setString(5, productName);
			statement.setInt(6, price);
			statement.setInt(7, total);
			statement.setString(8, mobile);
			statement.executeUpdate();

			// System.out.println(i +" Record inserted successfully...");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void getBill() {

		Connection con = null;
	//	String result = null;
		PreparedStatement statement = null;
		DatabaseCon dbc = new DatabaseCon();

		try {

			con = dbc.getConnection();

			statement = con.prepareStatement("select * from bill  ");

			ResultSet rs = statement.executeQuery();
			System.out.printf("                                   ONLINE SHOPPING APP       \n");

			System.out.printf("                                   BILLS DETAILS        \n");
			System.out.println();
			System.out.println();
			System.out.printf("| %-8s | %-16s | %-35s |%-10s  |%-10s |%-10s  |%-10s  |%-10s |%n", "Bill No",
					"Customer Name", "Mobile number", "Address", "Product ID ", "Product Name", "Price", "Total");
			System.out.printf(
					"-------------------------------------------------------------------------------------------\n");
			while (rs.next()) {

				// System.out.println("ID : "+ rs.getInt(1)+ " Product Name :
				// "+rs.getString(2)+" Description: "+rs.getString(3)+" Price : "+rs.getInt(4)+"
				// Quantity : "+rs.getInt(5));

				System.out.printf("| %-8s | %-16s | %-35s |%-10s  |%-10s |%-10s  |%-10s  |%-10s |%n", rs.getInt(1),
						rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7),
						rs.getInt(8));

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	public void generateProduct(String mobile) {

		Connection con = null;
	//	String result = null;
		PreparedStatement statement = null;
		DatabaseCon dbc = new DatabaseCon();

		try {

			con = dbc.getConnection();

			statement = con.prepareStatement("select p_id ,p_name,price , total from bill where mobile_no=?");
			
			statement.setString(1, mobile);

			ResultSet rs = statement.executeQuery();
			
		
		
			
			System.out.printf(
					"-----------------------------------------------------\n");
	
			System.out.printf("| %-8s | %-25s | %-10s |%-15s  |%n", 
					"Product ID ", "Product Name", "Price", "Total");
			System.out.printf(
					"-----------------------------------------------------\n");
			while (rs.next()) {

				// System.out.println("ID : "+ rs.getInt(1)+ " Product Name :
				// "+rs.getString(2)+" Description: "+rs.getString(3)+" Price : "+rs.getInt(4)+"
				// Quantity : "+rs.getInt(5));

				System.out.printf("| %-8s | %-25s | %-10s |%-15s  |%n", rs.getInt(1),
						rs.getString(2), rs.getInt(3),  rs.getInt(4));

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	public void generateBill(String mobile) {

		Connection con = null;
	//	String result = null;
		PreparedStatement statement = null;
		DatabaseCon dbc = new DatabaseCon();

		try {

			con = dbc.getConnection();

			statement = con.prepareStatement("select bill_no , customer_name , mobile_no , address from bill where mobile_no=?");
			
			statement.setString(1, mobile);

			ResultSet rs = statement.executeQuery();
			
		
		
			
			
			System.out.printf("                      ONLINE SHOPPING APP       \n");

			System.out.printf("                      Shopping Bill       \n");
			System.out.println();
			System.out.println();
			System.out.printf("| %-8s | %-16s | %-20s |%-10s |%n", "Bill No",
					"Customer Name", "Mobile number", "Address");
			System.out.printf(
					"-----------------------------------------------------\n");
			
			System.out.printf(
					"-----------------------------------------------------\n");
			while (rs.next()) {

				// System.out.println("ID : "+ rs.getInt(1)+ " Product Name :
				// "+rs.getString(2)+" Description: "+rs.getString(3)+" Price : "+rs.getInt(4)+"
				// Quantity : "+rs.getInt(5));

				System.out.printf("| %-8s | %-16s | %-20s |%-10s |%n", rs.getInt(1),
						rs.getString(2), rs.getString(3),  rs.getString(4));

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		this.generateProduct(mobile);

	}


	public String getuserName(int id) {

		Connection con = null;
		String result = null;
		PreparedStatement statement = null;
		DatabaseCon dbc = new DatabaseCon();

		try {

			con = dbc.getConnection();

			statement = con.prepareStatement("select u_name from user where u_id = ?");

			statement.setInt(1, id);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				result = rs.getString(1);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

	public String getuserMobile(int id) {

		Connection con = null;
		String result = null;
		PreparedStatement statement = null;
		DatabaseCon dbc = new DatabaseCon();

		try {

			con = dbc.getConnection();

			statement = con.prepareStatement("select mobile from user where u_id = ?");

			statement.setInt(1, id);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				result = rs.getString(1);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

	public String getuserAddress(int id) {

		Connection con = null;
		String result = null;
		PreparedStatement statement = null;
		DatabaseCon dbc = new DatabaseCon();

		try {

			con = dbc.getConnection();

			statement = con.prepareStatement("select address from user where u_id = ?");

			statement.setInt(1, id);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				result = rs.getString(1);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

}
