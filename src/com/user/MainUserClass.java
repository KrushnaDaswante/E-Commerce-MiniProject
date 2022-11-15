package com.user;

import java.util.Scanner;

import com.product.ProductDetails;

public class MainUserClass extends UserRegister {
	static String userName ;
	static String password;

	public void user() {

		Scanner scanner = new Scanner(System.in);
		UserLogin userLogin = new UserLogin();
		MainUserClass mainclass = new MainUserClass();
		UserRegister userReg = new UserRegister();
		Shopping shopping = new Shopping();

		ProductDetails productDetails = new ProductDetails();

		System.out.println("1. User Login.");
		System.out.println("2. User Registration.");

		System.out.println("Enter your choice: ");
		int no = scanner.nextInt();
		switch (no) {

		case 1: {
			boolean flag = false;
			do {
				System.out.print("Enter username:");
				 userName = scanner.next();

				System.out.print("Enter password:");
				 password = scanner.next();

				flag = userLogin.userLogin(userName, password);
				if (flag == true) {
					System.out.println("login successfully");
					productDetails.getProduct();
					shopping.selectProduct();
				} else {
					System.out.println(" Please try again..!!");

				}
			} while (flag == false);

		}
			break;
		case 2: {

			System.out.println("Enter User Details..");

			mainclass.newUserRegister();

			System.out.println("Login now ...");

			System.out.print("Enter username:");
			String userName = scanner.next();

			System.out.print("Enter password:");
			String password = scanner.next();

			boolean flag = userLogin.userLogin(userName, password);
			if (flag == true) {
				System.out.println("login successfully");
				productDetails.getProduct();
				shopping.selectProduct();
				

			}

		}
			break;
		default:
			System.out.println("Invalid Input.. Please try again !!!");
		}
	}

}
