package com.leaning.day5;

public abstract class Company {
    public  String name;
	public abstract void sales() ;
	public abstract void operations();
	
	public void profit() {
		System.out.println(" this is company profit methods");
	}
}
