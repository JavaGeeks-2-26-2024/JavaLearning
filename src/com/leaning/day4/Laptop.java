package com.leaning.day4;

public class Laptop {

	String type; 
	String model;
	String os;
	double size;
	int mfgYear;
	String specs;
	String color;
	
	String screenType = "touch";

	//color;model;os;mfgYear;
	
	public Laptop(String color, String model, String os, int mfgYear ) {
		this.color = color;
		this.model = model;
		this.os = os;
		this.mfgYear = mfgYear;
	}
	
	
	public void changeColor(String color) {
		this.color = color;
	}
	
	
	
	public void callAllTheMethods() {
		method1();	
		method2();
		methods3();
	}
	
	
	public void method1() {
		System.out.println("This is my method 1");
		
	}
	
	public void method2() {
		System.out.println("This is my method 2");
		
	}
	
	public void methods3() {
		System.out.println("This is my method 3");
	}
	
	
	public static void method4() {
		System.out.println(" This is a static method");
	}
}
