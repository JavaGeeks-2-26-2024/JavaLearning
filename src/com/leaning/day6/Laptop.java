package com.leaning.day6;

public class Laptop {
	
	int id;
	String name;
	double price;
	
	public Laptop(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id +" "+this.name +" "+this.price;
	}

}
