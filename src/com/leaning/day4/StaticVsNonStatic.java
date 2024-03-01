package com.leaning.day4;

public class StaticVsNonStatic {

	public static void main(String[] args) {
    
//		Static : 
//		Keyword called static
//		static members(attributes or methods) its always public.
//		static members(attributes or methods) always associated with the class itself. 
//		not with individual instances.
//		static members(attributes or methods) can only be accessed by class reference. 
		
	Laptop dell = new Laptop("red","10", "windows", 2024);
	System.out.println();
    
	
	Laptop.method4();
	
	Laptop hp = new Laptop("white","10", "windows", 2024);
	

	
	Laptop.method4();
	
	
	Animal dog = new Animal("dog", "xyz", 2);
	
	Animal cat = new Animal("cat", "xz", 1);

	
	
	System.out.println(Animal.noOfAnimalsCreated);
	
	}

}
