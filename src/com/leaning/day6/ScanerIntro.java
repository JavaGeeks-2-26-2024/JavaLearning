package com.leaning.day6;

import java.util.Scanner;

public class ScanerIntro {

	public static void main(String[] args) {
		
//		 Scanner class is used to get user input
//		its imported from java.util 
		
//		 1. Scnanner object  -> System.in 
//		-> nextLine() next() ->  String
//      -> nextBoolean()
//		-> nextInt()
//		..... -> 
		
//		Scanner scanner1 = new Scanner(System.in);
		
//		System.out.println("Enter your name: ");
//	     String name=	scanner1.nextLine();
//	     
//	 	System.out.println("Enter your last name: ");
//	     String lastname=	scanner1.nextLine();
//		
//	    System.out.println("enter age :"); 
//	    double age=	scanner1.nextDouble();
//	    
//	    scanner1.nextLine();
//	    
//	    System.out.println("Enter your user name: ");
//	     String username=	scanner1.nextLine();
//	     
//	     
//	     System.out.println(name);
//	     System.out.println(lastname);
//	     System.out.println(age);
//	     System.out.println(username);
	     
// take a input	     
//	      -> firstName
//	      -> lastNAme
//	      -> phonenumber 
//	      -> email
//	      -> dob 12-4-2022
//	      -> age 
//	      -> address 
	      

		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("enter the laptop Id: ");
		
		int id = scanner1.nextInt();
		
		scanner1.nextLine();
		
		System.out.println("Enter the laptop Name: ");
		
		String name = scanner1.nextLine();
		
		System.out.println("Enter the laptop Price: ");
	     
		double price = scanner1.nextDouble();
	      
	     
	     Laptop laptop1 = new Laptop(id, name, price);
	     
	     System.out.println(laptop1.toString());
		
	}

}
