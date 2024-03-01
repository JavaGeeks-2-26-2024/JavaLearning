package com.leaning.day2;

public class ConditionalStatements {

	public static void main(String[] args) {
		// 4 conditional statements
		// if
		// if else
		// else if
		// switch

		// find a senior and minor people whose age is above 50 years and below 18 years

		int age = 2;

		// if(condition){
		// body --> we will write a code
		// }

//		if(age > 50) {
//			System.out.println("senior");
//		}

//		if(age > 50) {
//			System.out.println("senior");
//			
//		}else {
//			System.out.println("not a senior");
//		}

		if (age > 50) {
			System.out.println("senior");
		} else if (age < 18) {
			System.out.println("Minor");
		} else {
			System.out.println("Not a Minor,not a senior");
		}

		// write a program to find out the grades based on markes

		// 100- 90 - A
		// 89 - 80 - B
		// 79 - 70 - C
		// 69 - 60 - D
		// 59 - 50 - E
		// < 50 - F
		// > 500 -> highest
		System.out.println("------------------------------------");
		int marks = 45;
		int total = 455;

		if (marks <= 100 && marks >= 90) {

			System.out.println("A");

		} else if (marks < 90 && marks >= 80) {

			System.out.println("B");

		} else if (marks < 80 && marks >= 70) {

			System.out.println("C");

		} else if (marks < 70 && marks >= 60) {

			System.out.println("D");

		} else if (marks < 60 && marks >= 50) {

			System.out.println("E");

		} else {
			System.out.println("F");
		}

//-----------------------------------------------------
		if (marks >= 50) {

			if (total > 500) {
				System.out.println("highest");

			} else {
				System.out.println("Not highest");
			}
		}

		//

		boolean redcolor = true;
		int carYear = 2024;

//		
//		if( carYear == 2024 && redcolor) {
//			System.out.println("my car is new and its color is red");
//		}else if( carYear == 2024 && !redcolor){
//			System.out.println("my car is new and its color is not red");
//		}
//		

		boolean green = false;
		boolean red = false;
		boolean yellow = true;
		// -------------------
		boolean walkSign = true;
		if (green && !walkSign) {
			System.out.println("cars are moving");
		} else if (!green) {

			if (red && walkSign) {

				System.out.println(" start walking and cars has been stopped");

			} else if (yellow && walkSign) {
				System.out.println(" start walking and watch out for cars");
			}

		}

//----------------------------------------------------------
		// switch

		// switch (expression){
		// case var1:
		// code
		// break;
		// case var2:
		// code
		// break;
		// default:
		// code

		// }

		// find a month based on month number
		System.out.println("-------------------------------------");
		int month = 4;

		switch (month) {
		case 1:
			System.out.println("its a Jan");
			break;
		case 2:
			System.out.println("its a Feb");
			break;
		default:
			System.out.println(" I dont have a data right now");

		}

		String color = "red";

		switch (color) {
		case "red":
            System.out.println(" its a red color"); 
			break;
		case "green":
			System.out.println(" its a green color"); 
			break;
		case "blue":
			System.out.println(" its a blue color"); 
			break;
		default:
			System.out.println(" i dont know this color");

		}

	}

}
