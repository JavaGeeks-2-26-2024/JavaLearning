package com.leaning.intro;

public class Datatypes {

	public static void main(String[] args) {
	
		
		// In Java two datatypes 
		//                     - Primitive Data type
		//                     - Non- primitive Data type
		
		
//  8 primitive data types 
		
//		1. byte      -  1 byte         -128 to 127 
//		2. short     -  2 bytes        -32768 to 32767
//		3. int       -  4 bytes       -2,147,483,648   to  2,147,483,647
//		4. long      -  8 bytes       -9,223,372,036,854,775,808   to 9,223,372,036,854,775,807
//		5. float     -  4 bytes          store up to 6 to 7 decimal digits 
//		                              ex: 12.2222222
//		6. double    -  8 bytes         store up to 15 decimal digits
//		                              ex: 12.22222222345678
//		7. boolean   - 1 bit            true or false
//		8. char      - 2 bytes           signle charactor , need single quotes
		
//		Non- primitive Data type
//		 - String 
		
		
//		syntax of variable
		
//     type name  = value;	
		
final   byte count = 120;
		boolean option = true;
		int a = 100000;
		long b = 142777;
		double c= 10.57;
		float d = 10.67f;
		char  e = 'g';
		short f = 123;
		
		
		//System.out.println(count);
//		count = 20;
//		System.out.println(a);
//		a=1;
//		System.out.println(a);
//		System.out.println(count);
		
		
		
//		type casting
		
//		wideing casting   - automatically -> converting smaller type to larger type
//		byte -> short -> int -> long -> float -> double
		
		byte value = 10;
		
		int anothervalue = value; //10
		
		
		System.out.println(value);
		System.out.println(anothervalue);
		
		// value is 10
		
		value =20;
		
		// value is 20
		
		System.out.println(value);
		System.out.println(anothervalue);
		
//		Narrowing Casting - manually -> larger type to smaller type 
//		byte <- short <- int <- long <- float <- double
		
		
		
		int person1_money = 1000;
		
		int person2_money = 2500;
		
		
		int total = person1_money+ person2_money;
		
		System.out.println("---------------before-------------");
		System.out.println(total);
		
		person1_money = 3500;
		
		System.out.println("---------------after-------------");
		total = person1_money+ person2_money;
		
		
		System.out.println(total);
		
		
		
		
		
		byte smallvalue = 126;
		// -128 to 127
		
		int largerValue = smallvalue;  // 2b
		//   126
		
		
		largerValue = 126;
	  //   10
		
		
		smallvalue = (byte)largerValue; // 2b

		
		
		
		byte studentcount = 12;
		
		
		short studentFee = 1000;
		
		int total1 = studentcount *  studentFee;
		
		
		System.out.println(total1);
		
	
		int studentcount2 = 2;
		
		short studentFee2 = 10;
		
		byte total2 = (byte)((byte)studentcount2 *  (byte)studentFee2);
		
		
		System.out.println(total2);
		
		
		
		
		
		
		
		

	}

}
