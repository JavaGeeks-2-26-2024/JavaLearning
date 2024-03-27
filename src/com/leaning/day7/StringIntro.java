package com.leaning.day7;

public class StringIntro {

	public static void main(String[] args) {

//		 String is a variable that contains a collection of Characters
//		Strings are Immutable  -> Once a string object is created, its value can not be changed.
//		 when you modify a string -> it will actually create a new string
		
//		->Java Memory 
//		 1. Heap Memory 
//		        -> Java Objects will be stored in heap, which is a portion of memory dedicated to storing objects and arrays.  
//		        -> heap is shared among al threads in JVM
//		 2. Stack memory 
//		         ->Java uses statck memory to store local variables and method call information.
//		         -> Each thread in JVM has its own stack, which is used for method calls and local variables.
		
		
		   String s1 = "hello world";
		   String s2 = "hello world";
		   
		   String s4 = "hello world";
		   String s5 = "hello world";
		   String s6 = "hello world";
		   String s7 = "hello world";
		   String s8 = "hello world";
		   String s9 = "hello world";
		   
		   String s3 = new String("hello world");
		   
		   
		   String s10 = new String("hello world");
		   
		   System.out.println(s2 == s1);
		   
		   System.out.println(s1==s3);
		   
		   System.out.println(s3 == s10);
		   
		   
		   s1 = "hello";
		   
		   
		  
//		       012345678910
		  s1= "hello world";
		  
//		  s1= "hello worl";
//		  s1= "hello wo";
		  
		  
		  System.out.println(s1.length());
		  
		  System.out.println(s1.charAt(6));
		  
		  
		  System.out.println(s1.indexOf('w'));
		  
		  System.out.println(s1.substring(4));
		  
		  System.out.println(s1.substring(3,6));
		  
		  System.out.println(s3 == s10);  // == shallow comparison 
		  
		  System.out.println(s3.equals(s10));  //   == deep comparison , The == operator is used to check if two string references point to the same object in memory.
		  
		  
	            String s15  ="hello";
		  
	            String s16  ="hello";
	            
		    String s17 = "hi";
		  
		    String s18 = "hi";
		    String s19 = new String("hi");
		    
		         String name = "Joy";
		         
		         
//		         stringVar.concat(anotherStringVar or string value)
		         
		         System.out.println(s18 + "  "+ name); // String concatenation, we use operator + 

		        System.out.println(s18.concat("  ").concat(name));
	     
		    
	
		        // StringBuilder and StringBuffer  -> mutable
//		                      -> this classes will allow you to modify strings without creating new objects eachtime.
//		                      -> Both classes will provide similar functionlity, but they differ in their thread safety.
		        
		        
		            
		    
//		        StringBuilder   => it is not thread safe
//		                        -> which means its not suitable for use in multithreaded environments.
//		                        -> however it is more efficient than stringBuffer.
		  
		           StringBuilder sb = new StringBuilder();
		           
		           sb.append("hello");
		           sb.append(" ");
		           sb.append("world");
		           
		           System.out.println(sb);   // the output is the type of StringBuilder
//		           String str1 = sb;
		           String str = sb.toString();
		           
		           System.out.println(str);  // the output is the type of String
		                 
		  
		  
		  
		           
//		           StringBuffer   => it is thread safe
//                   -> which means its suitable for use in multithreaded environments.
//                   -> however it is less efficient than StringBuilder.
		  
		  
		  
		           StringBuffer strBuf = new StringBuffer();
		           
		           strBuf.append("hello");
		           strBuf.append("  ");
		           strBuf.append("world");
		            
		           strBuf.replace(0, 5, "my");
		           
		           System.out.println(strBuf);   // the output is the type of StringBuffer
//		           String str2 = strBuf;
		           
		           String str2 = strBuf.toString();
		           
		           System.out.println(str2);
		  
		  
		  
		
		
		
	}

}
