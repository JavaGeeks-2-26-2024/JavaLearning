package com.leaning.day5;

public class Triangle extends Shape {
	int base; 
	int side;
	
	@Override
	public int area() {
	return calcArea();
	}
	
	
	private int calcArea() {
		
	return base*side;
	}
	
	

}
