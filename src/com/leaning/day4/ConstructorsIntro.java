package com.leaning.day4;

public class ConstructorsIntro {

	public static void main(String[] args) {
		// Special method that is used to initialise the objects.
//		 by default constructor method will be called when an object of a class is created.
//		 it will be used to set the initial values of object attributes.
	
//		rules:
//		1. it has to use Class name 
//		2. no return types  ( not void , not other types, it will be blank)
//		3. almost we will make it public.
		

		
//		default constructor
		
// public className(){
		
//	}
	
		
//		parameterized constructor
		
//      public className(dataType varName,.......){
		
//		}	
		
		
		Phone apple = new Phone("red","10", "ios", 2024);
		
		apple.changeColor("blue");
		
		System.out.println(apple.color);
		
	
// Keyword called "this" 
//		this  keyword refers to the current object (itself) in method or constructor
//      -> it is used to eliminate the confusion between class attributes and parameters 
//		    with the same name.
		
		
		Laptop dell = new Laptop("red","10", "ios", 2024);
		
		dell.callAllTheMethods();
		
				
		
		
		

	}

}
