package com.leaning.day8and9;

public class ExceptionsIntro {

	public static void main(String[] args) {
 
		//   Exception : abnormal termination of progream.
		
// 		         
//		types of Exceptions:
//		                 1. Checked Exception
//		                              ->chcked at compile time, Extends the "Exception" class
//		                              -> methods that might throw a checked Exception must declare it in their "throws" clause.
//		                              -> handle it using try/Catch block.
//		                 2. UnChecked Exception
//		                              -> not checked at compile time., Extends the "RuntimeException" class
//	                                  -> methods that might throw a UnChecked Exception no need declare it in their "throws" clause.
//		                              -> caught explicitly
		
		
		
//Exception Handling : In order to stop the abnormal termination of progream, we use Exception Handling.
//		              try  , catch and finally.

		
//		Exception handling hierarchy
		
//	     Throwable -MainClass
//		 Exception - subclass
//		 RuntimeException - subclass
//		 IOExceptions
//		 SQLExceptions
//		 ClassNotFoundException
//		 ArrayIndexOutOfBoundException
//		 StringIndexOutOfBoundException
		
		
// Error
//		 OutOfMemoryError
//		 StackOverFlowError
//		 VirtualMachineError
		
		
		int  a=10;
		int b=0;
		
	
		
//		try {
//	
////			System.out.println(a/b);
//			divide(a, b);
//			
//		}catch(Exception exception) {
//			
//			System.out.println(exception.getMessage());
//		
//			System.out.println(exception);
//			
//			exception.printStackTrace();
//		}
		
		
		ATM myatm = new ATM();
		
	     try {
			myatm.withdraw(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static int divide (int a , int b) {
		if(b==0) {
			throw new ArithmeticException("division by Zero is not possible");
		}
		return a/b;
	}
	
	
	
	

}
