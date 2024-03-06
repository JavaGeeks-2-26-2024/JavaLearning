package com.leaning.day7;

import java.util.Scanner;

public class Classwork {

	public static void main(String[] args) {
		
		
//	take a 
//		name, 
//		id, 
//		course, 
//		marks 
//		stop
//	input from user 
		

		
//		   output
//		   Joy with Id : 12 enrolled in a course : fullstack developer and recived 90 marks.
		
		
		   System.out.println("Welcome to my store");
		   
		   Scanner sc = new Scanner(System.in);
		   
		   int option = 0;
		   boolean mainstop = false;
		  while(!mainstop) {
			  
			  System.out.println("1. Do you want to login");
			   System.out.println("2. Do want to exit.");
			   option = sc.nextInt();
			   sc.nextLine();
			   switch(option) {
			   case 1 :
				     boolean stopCreatingObject = false;
				       while(!stopCreatingObject) {
				    	   
				    	   System.out.println("user logged in");
						   System.out.println("......");
						   System.out.println("......");
						   System.out.println("......");
						   System.out.println("......");
					       System.out.println("Do you want to go to main menu ?");
					       stopCreatingObject = sc.nextBoolean();
					       sc.nextLine();
				       }
				     
				   break;
			   case 2:
				    System.out.println("Exit");
				    mainstop= true;
				   break;
			   }
		  }
		   
		
		

	}

}
