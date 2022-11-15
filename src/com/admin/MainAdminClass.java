package com.admin;

import com.mainclass.*;
import com.product.*;
import com.user.*;
import java.util.Scanner;

public class MainAdminClass extends ProductDetails {

	Scanner scanner = new Scanner(System.in);

	public void admin() {

		MainAdminClass adminObject = new MainAdminClass();
		AdminClass adminClass = new AdminClass();
		boolean flag = false;

		System.out.println("Login into admin account.");

		do {
			System.out.print("Enter username:");
			String userName = scanner.next();

			System.out.print("Enter password:");
			String password = scanner.next();

			flag = adminClass.adminLogin(userName, password);

			if (flag == true) {
				System.out.println("login successfully");
				this.adminFunction();
			} else {
				System.out.println(" Please try again..!!");

			}
		} while (flag == false);

	}

	public void adminFunction() {
		SetData setData = new SetData();
		ProductDetails product = new ProductDetails();
		UserRegister userReg = new UserRegister();
		TestMain test = new TestMain();
		MainUserClass mainUser = new MainUserClass();
		Shopping shop = new Shopping();
		boolean loop = false;
		do {
		System.out.println("1. Add new Products.");
		System.out.println("2. View Product Details and Inventory .");
		System.out.println("3. View Users Details.");
		System.out.println("4. View Billing Records.");
		System.out.println("5. Exit");

		System.out.println("Enter your choice :");

		int num = scanner.nextInt();
		
		

		switch (num) {

		case 1:

			setData.productInfo();
			loop=true;
			break;

		case 2:
			product.getProduct();
			loop=true;
			break;

		case 3:

			userReg.getUserDetails();
			loop=true;
			break;
		case 4:
			 shop.getBill();
			 loop = true;
			 break;
			
		case 5:
			loop =false;
			test.main(null);
			break;
			

		default:
			
			System.out.println("Invalid Input . please try again.");
			loop=true;
			break;

		}
		
		} while(loop== true);
	}

}
