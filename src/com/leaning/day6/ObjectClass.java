package com.leaning.day6;

public class ObjectClass {
	
//	 its a root/parent  class for all the objects that are created inside a java
	
//	  -> toString();
//             	-> it will return thr string representation of the Object.
//	  -> equals(Object obj);
//	            -> it will be used to indicate whether some other object is equal to this one. 
//	            -> by default it will check whether both belongs to same memory location or not.
//	  -> hashCode();
//	            -> it will return the hash code value of object.
//	  -> getClass();
//	            -> this will returns an instance of the "Class" class, which provides information about the class.
//	  -> clone();
//	            -> it will create the new copy of the obejcta amnd returns it.
//	  -> finalize();
//	            -> it will be called by garbage collector on an object when garage collection determines that 
//	              there are no more references to that object.
	
	
	public static void main(String[] args) {
		  Object obj = new Object();
		  Object obj2 = new Object();
		    System.out.println(obj.toString());
		    System.out.println(obj.hashCode());
		    System.out.println(obj.getClass());
		    System.out.println(obj2.hashCode());
		    System.out.println(obj.equals(obj2));
		  
		    Student student1 = new Student(1, "joy");
		    Student student2 = new Student(2, "ana");
		    Student student3 = new Student(3, "joy");
		    
		    System.out.println(student1.equals(student3));
		    
		    System.out.println(student1.toString());
		    System.out.println(student2.toString());
		    
		    
		    
//		 -----------------------------------------------------------------   
		    
		    
			
			
			//   Product   -> id, name , price, rating  - > Abstract class 
	        //		             -> checkTotalSales() - > this is a normal method
	        //----------------------------------------------------------------		
			//   Laptop  -- > screenSize, RAM, SSD, processer
	        //		             -> checkCharging,   checkLogin
			
			//----------------------------------------- phase 2
	        //		             -> constructor
	        //		             -> Override the default toString to print the Object 
	        //		                 with id, name , price,  screenSize, RAM, SSD, processer
			
			//----------------------------------------- phase 3
	        //                     -> Override the default equals to compare two Objects 
	        //		                 comparession condition    id, ram, ssd, processer needs to be same to be equal 	
			//----------------------------------------------------------------			
			//   Table   -- >    height, width, length
	        //		             -> area method, volumn method
			
			//-----------------------------------------phase 2
	        //                   -> constructor
			//		             -> Override the default toString to print the Object 
	        //		                 with id, name , price,  height, width, length
			
			//----------------------------------------- phase 3
	        //                     -> Override the default equals to compare two Objects 
	        //		                 comparession condition    id, length, height, width needs to be same to be equal 
			//----------------------------------------------------------------			
			//    Light  ->  wats, lumens 
	        //                   -> noOfAmps,  checkPowerUTil
			
			//-----------------------------------------phase 2
	        //                   -> constructor
	        //                   -> Override the default toString to print the Object 
	        //		                 with id, name , price,  wats, lumens 
			
			//----------------------------------------- phase 3
	        //                     -> Override the default equals to compare two Objects 
	        //		                 comparession condition    id, wats, lumens  needs to be same to be equal 
			
			// create getters and setters -Product, Laptop,Table, Light
		    // create another Application Class with main method and create each object
//		     take a values using scanner Object
		    
		    
		    
	}

}
