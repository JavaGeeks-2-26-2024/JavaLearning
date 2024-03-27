package com.learning.java.AdvancedJava;

public class Mythread extends Thread {
	
	@Override
	public void run() {
		System.out.println(" This is my Thread");
	}
	
	public static void main(String[] args) throws InterruptedException {
		Mythread thread1 = new Mythread();
		
		thread1.start();
		System.out.println(thread1.isAlive());
		
		thread1.stop();
		thread1.sleep(3000);
		System.out.println(thread1.isAlive());
	}

}
