package com.learning.java.AdvancedJava;

public class SynchronizationExample {
	
	private static int count =0;
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(()->{
			for(int i=0; i<1000; i++) {
				increase();
			}
		});
		
		Thread thread2 = new Thread(()->{
			for(int i=0; i<1000; i++) {
				increase();
			}
		});
		
		
		thread1.start();
		thread2.start();
		
	}
	
	public static synchronized void increase() {
		
		count++;
		System.out.println(count);
	}

}
