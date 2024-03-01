package com.leaning.day3;

public class Calc {
	


	public static void main(String[] args) {
		
		Calc calc1= new Calc();
	
         System.out.println(calc1.sum(6.1, 6.2));
         
         
		 int output = calc1.sum2(10, 10, 2.5);
		 
		 System.out.println(output);
		 
//		  calc1.sum2(15, 20, 21.5)  = 56.5
		 
//		 System.out.println(output2);
		
	}

	
// build  method to to take two double input values and return the double sum of them

//      public returnType  methodName(type variableName, ....){
//		
//		body of a method
//		return returnValue;
//		}
	
	public double sum(double a, double b) {
		
		double sum = a+b;
		
		return sum;
	}
	
	
// build  method to to take 2 int input values, 1 double input and return the int sum of them.

	public int sum2(int a, int b, double c) {
		
		int addition = a+b+(int)c;
		
		return addition;
	}
	
	
//	Tv -> has Attributes -> type, model, os, size, mfgYear, specs, color
//    has Methods -> chnageChannel(), swich(), operations(), volume()
//	              -> getType() => return type
//	              -> getOs() => return os
//	              -> getMfgYear()   => return mfgYear
//	              -> updateColor()  => take a input color to update
//	              -> updateModel()  => take a input model to update


// classRoom -> noOfStudents, type, mode, course, status
//          -> status(), studying(), exam()
//          -> getNoOfStudents()  => return noOfStudents
//          -> getCourse()     => return course
//	        -> updateType()  => take a input value "hybrid"

}
