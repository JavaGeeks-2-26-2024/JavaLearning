package com.leaning.intro;

public class Operators {

	public static void main(String[] args) {
		
		
		
//		 5 types of Operators 
		
//		1. Arthmetic Operators
//		             + , -, / , * , ++, --, %
//		2. Assignment Operators
//		             =, +=, -=, *=, /=, &=, |=, ^=, >>=, <<=
//		3. Comparsion Operators 
//		             ==, !=, > , < , >=, <=
//		4. Logical Operators 
//		             &&, || , !
//		5. Bitwise Operators 
		
		int a = 10;
		int b=20;
		int sum = a+b;
		System.out.println(sum);
		
		int sub = a-b;
		
		System.out.println(sub);
		
		int mul= a*b;
		 System.out.println(mul);
		
		 double div = (double)a/b;
		 
		 System.out.println(div);
		 
		 
//		 a++;
//		 
//		 System.out.println(a);
//		 b--;
//		 
//		 System.out.println(b);
		 
		 
		 double rem = a%b;
		 
		 System.out.println(rem);
		 
		 
		int c = 10; 
		int d = 10;
		
		 d += 10; // d= d+10;
		 System.out.println(d); 
		 d -= 5;  // d = d-5;
		 System.out.println(d);
		 d *= 2;  // d = d*2;
		 System.out.println(d);
		 d /= 3;  // d = d/3;
	
		 
		 System.out.println(d);
		   
		  d &= 10;  // d = d 
			 
		System.out.println(d);
		 c=5;
		 
		 System.out.println(c == d); //  equal 
		 System.out.println(c != d);  // not equal
		// c=5; d=10;  
		 System.out.println(c > d);  // false
		 System.out.println(c < d); // true
		 
		 System.out.println(c >= d); // false
		 System.out.println(c <= d); // true
		 
		 System.out.println("-------------------------------");
		 // and   &&     condition1  && condition2   => true
		 //                 true            true
		// c=5; d=10;  
		 System.out.println((c == d) && (c < d) ); // false
		 System.out.println((c <= d) && (c < d));  // true
		 System.out.println((c >= d) && (c > d));  // false
		 System.out.println((c <= d) && (c > d) && (c==d));// false
		 
		 
		 // or    ||      condition1  || condition2   => true
//		                     true          false
//		                     false         true
//		                     true          true
		 System.out.println((c == d) || (c < d) ); // true
		 System.out.println((c <= d) || (c < d));  // true
		 System.out.println((c >= d) || (c > d));  // false
		 System.out.println((c <= d) || (c > d) || (c==d));// true
		 
		
		 
		// c=5; d=10; 
		 System.out.println( ( (c == d) || (c < d) )  &&  (c <= d) ); // true
		
		 System.out.println(!(((c <= d) && (c > d) ) || (c<=d))); // false
		
		 
		 System.out.println((c <= d) || (c > d) && (c==d)); // true
		 
		 // not   !       !(condition1)   
//	                       !(true)   => false 
//		                   ! (false)  => true
		 
		 
		 
		 
		           
	}

}
