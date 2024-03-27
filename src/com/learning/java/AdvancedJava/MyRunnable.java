package com.learning.java.AdvancedJava;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
	System.out.println(" This is Runnable");
		
	}

	
	public static void main(String[] args) {
		Thread mythread1 = new Thread(new MyRunnable());
		mythread1.start();
	}
}
