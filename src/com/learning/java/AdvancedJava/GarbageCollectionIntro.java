package com.learning.java.AdvancedJava;

public class GarbageCollectionIntro {

	public static void main(String[] args) {
		
//GarbageCollection  => compenent that many many programming languages have, including Java,
//		                automatically manages memory by reclaming memory occupied by objects that are no longer in use.
		String str1 = new String("This is String 1");
		
		str1 =null;
		
		GCExampleClass gcEx = new GCExampleClass();
		gcEx =null;
		
		
//		Garbage Collection Strategies :
//		 Serial Garbage Collector 
//		              -> suitable for single threaded application. use signle thread for Garbage Collection
//		 Parallel  Garbage Collector
//		             -> suitable for  Multiple threaded application.use Multiple thread for Garbage Collection
//		 Concurrent Mark Sweep(CMS) Collector
//		            -> Minimizes applicxation pause times by running most of gc work concurrently with applicatrion threads..
//		 G1  Garbage Collector
//		            ->Designed to provide more predicatable pause times by dividing the head memeory into regions and performing GC on these Regions
		
		
		System.gc();

	}

}
