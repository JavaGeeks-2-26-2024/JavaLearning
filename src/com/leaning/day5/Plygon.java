package com.leaning.day5;

public class Plygon extends Shape{

	
	
	@Override
	public int area() {
		// TODO Auto-generated method stub
		return calcArea1()+calcArea11()-calcArea2();
	}
	
	
	private int calcArea1() {
		return 5;
		
	}
private int calcArea2() {
	return 4;
		
	}
private int calcArea11() {
	return 10;
	
}

}
