package com.learning.java.AdvancedJava;

public class GCExampleClass {
	
	

	@Override
	protected void finalize() throws Throwable {
	  System.out.println(" This Object is collected by GarbageCollector");
	}

}
