package com.mainclass;
import com.user.*;
import com.admin.*;
import java.util.Scanner;



public class TestMain {

	public static void main(String[] args) {
		
		System.out.println(" Welcome to Online Shopping app ..");
		MainUserClass mainuser = new MainUserClass();
		MainAdminClass mainAdmin = new MainAdminClass();
		Scanner scanner = new Scanner(System.in);
		boolean flag= false;
		
		
	do {	
		System.out.println("1. User ");
		System.out.println("2. Admin");
		
		System.out.print("Enter one choice :");
	
	String n = scanner.next();
	
		
		switch(n) {
		
		case "1" :
			mainuser.user();
			break;
			
		case "2": 
			mainAdmin.admin();
			break;
			
			
	    default:
				flag= true;
				System.out.println("Invalid input.. Please try again!!!");
			
		}
		
		
	}while(flag==true);	
		
	
	

}
}