package com.leaning.day2;

public class LoopStatements {

	public static void main(String[] args) {
		
		// For loop 
		// While Loop
		/// Do while Loop

		// For Loop 
		
		
		
//		for(statement1 ; statement2 ; statement3 ) {
//			  body - > code 
//		}
		
//		for(initialization ; condition ; increment / decrement) {
//			
//			// repeting lines of code 
//		}
		
		
		for(int i =1; i<=10  ; i++) {
			
			System.out.println(i);
		
		}
		
		// print 10, 9, 8  to 1  using for loop 
		
		for(int i =10; i >=1   ;i--) {
			System.out.println(i);
		}
		
		// 232, 234, 236, .......................................486
		
		for(int i =232; i <= 486; i=i+2) {
			System.out.println(i);
		}
		
		
		// 1000, 990, 980 .........500
		 for(int i =1000; i>=500; i = i-10) {
			 System.out.println(i);
		 }
		 
		 
		 //-----------------------------------------------------
		 
		 
		
		 for(int outer=1; outer <=5; outer++) {
			 
			 System.out.println("outer");
			 for(int inner= 1; inner <=3; inner++) {
				 System.out.println("..inner...");
				 
			 }
			 
		 }
//---------------------------------------------------------------------------		 
		 
		// while loop 
		 
		 
//		 while(condition) {
//			 body
//		 }
		 
//		 initialization
//		 while(condition) {
//		 body
		 
//		 increment / decrement
//	    }
	 	 
		 // 1, 2, 3,4 ......10
		 
		 int i =1;
		 while(i<=10) {   // 1 2...... 10
                i++;       // 2 3 ......11
			 System.out.println(i);// 2 3   10, 11	 

		 }
	
	System.out.println("---------------------------------------");	 
		 
	//do while 
		 

		 
//		 initialization	 
//		 do {
////			 code body
//		 }
//		while(condition)
		 
		 
		 
		 int a =1;
		 
		 do {
			 System.out.println(a);
			 a++;
		 }
		 while(a<=10);
		 
		//------------------------------------------------------------
		 
		 // print 1 , 2, 3........50, check each number is even or odd. 
		 
		 //step 1 => print values 
		 //step 2 => number is even or odd =>number/2 ->even or odd 
//		          => number % 2 ==0 -> even
		 int b=1;
		 while(b<=50) {
		      if(b %2 == 0) {
		    	  System.out.println(" its a even");
		      }else {
		    	  System.out.println(" its a odd");
		      }
			 System.out.println(b);
			 
			 b++;
			 
		 }
		 
//    Check and print only multiples of 3 in this series 1000, 999, 
//		 998 , 997, .............................1
//     
		 int c=1000;
		 while(c>=1) {
		     
			 if(c %3 == 0) {
				 System.out.println(c);
			 }
			  
			 c--;
			 
		 } 
//---------------------------------------------------------- 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
