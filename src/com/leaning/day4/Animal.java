package com.leaning.day4;

public class Animal {
     
	
	static int noOfAnimalsCreated =0;
	static int noOflegs = 4;
	
	     String type; 
	     String name;
	     int age;
	 
	 public  Animal(String type, String name, int age) {

		 noOfAnimalsCreated++;
		 
		 this.type = type;
		 this.age= age;
		 this.name= name;
		 
	 }
	     
	
	
	
	
}
