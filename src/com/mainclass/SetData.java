package com.mainclass;
import java.util.*;

import com.product.*;

import java.util.Scanner;

public class SetData {

	ProductDetails pd = new ProductDetails();

	public void productInfo() {
		int i = 1;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Product name:");
		String name = scanner.nextLine();

		System.out.print("Enter Product Description:");
		String description = scanner.nextLine();

		System.out.print("Enter Product Price :");
		int price = scanner.nextInt();

		System.out.print("Enter Product Quentity :");

		int quantity = scanner.nextInt();
		
		

		pd.setProduct(name, description, price, quantity);

	}

}
