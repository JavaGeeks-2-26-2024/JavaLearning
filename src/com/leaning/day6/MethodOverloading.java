package com.leaning.day6;



public class MethodOverloading {
	
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
	    calc.add(10, 12);
	    calc.add(10, 11, 5);
	    
	    // add 10.5 11.5
	    calc.add(10.5, 11.5);
	    
	}
	
	
	
//	 method name -> same 
//	 different number of paramenters with same datatype 
//	 different datatypes with same number of paramenetrs 
//	 with in the same class 

}
