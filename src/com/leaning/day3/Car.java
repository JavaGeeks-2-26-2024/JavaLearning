package com.leaning.day3;

public class Car {
//  Car  > has Attributes -> 	name, color, model, mfgYear, mileage
//    > has Methods -> drive(), stop()
	
	String name ;
	String color;
	String model;
	int mfgYear;
	int mileage;
	double price;
	
	
//	public void methodName(){
//		
//		body of a method
		
//		}
	
	
  public void drive() {
	  System.out.println("my car is in drive mode");
  }
  
  
  public void stop() {
	System.out.println("my car is in stop mode");  
  }
  
  
  public void changeColorToRed() {
	  color ="red";
  }
	
  
 public void chnageColor(String updatedColor) {
	 color= updatedColor;
 }
 
 public double changePrice(double updatedPrice) {
	  price = updatedPrice;
	 
	  return price;
 }

}
