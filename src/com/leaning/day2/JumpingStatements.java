package com.leaning.day2;

public class JumpingStatements {

	public static void main(String[] args) {
		
		// break         -> to stop the loop
//		   continue      -> to skip current iteration of the loop
		
//		dont print after 53
		
		for(int i =0; i<=100; i++) {
			System.out.println(i);
			if(i == 53) {
				break;
			}
		}
	
		System.out.println("-------------------------------");

		
		//     do not print multiples of 5 		
		
		for(int i =0; i<=100; i++) {
			if(i % 5 == 0) {
				continue;
			}
			
			System.out.println(i);
		}
		
		
		System.out.println("--------------------------------------");
		System.out.print("hello");
		System.out.print("world");
		System.out.println();
		System.out.println("hello");
		System.out.println("world");
		
		
//		  * * * * *         row no - 1   => missing - 0
//		  * * * *           row no -2   => missing  - 1
//		  * * *             row no -3   => missing  - 2 
//		  * *
//		  *
	
		
		for(int i=1; i <=5; i++) {
			
			
			for(int j =1; j<=i-1;j++) {
				System.out.print("  ");
			}
			
			for(int j =5-(i-1); j>=1;j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
//		*
//		* * 
//		* * *
//		* * * *
//		* * * * *
		
//		----------------------------
		
//		       *
//		     * *
//		   * * *
//		 * * * *
//     * * * * *
		
// ---------------------------------
//           * * * * *
//		       * * * *
//		         * * *
//		           * *
//		             *
//		 ------------------------------------
//		 WAP to find given year is leap year or not.
		
		
		int year =2016;
		if((year % 4 == 0 && year %100 != 0) || year % 400 == 0) {
			System.out.println("its a leap year");
		}else {
			System.out.println("its a not leap year");
		}
		
		
		
		
		
		
	}

}
