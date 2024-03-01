package com.leaning.day5;

public class Calculator {
	
	
	
	
	
	private int sum(int a, int b) {
		return a+b;
	}
	
	private int div(int a, int b) {
		return a/b;
	}
	private int mul(int a, int b) {
		return a*b;
	}
	
	private int sub(int a, int b) {
		return a-b;
	}
	
	public int getArea(int side, int base, String inputShape) {
		int area=0;
		if(inputShape.equals("triangle")) {
			area =areaofTriangle(side, base);
		}else if(inputShape.equals("square")) {
			area = areaofSqare(side);
		}
		
		return area;
	}
	
	private int areaofTriangle(int side, int base) {
		System.out.println("its a triangle");
	        int area=mul(side, base);
		return area;
	}
	
	
	private int areaofSqare(int side) {
		System.out.println("its a Sqare");
		int area= mul(side, side);
		return area;
	}

}
