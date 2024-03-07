package com.leaning.day8and9;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableVSComparator {

	public static void main(String[] args) {
	
//		       Comparable                                                    Comparator
		
		// Comparable is a interface java.lang                            Comparator  is a interfcae => java.util
//		it used to compare ciurrent object with another object                its used for comparing two objects 
//		  compateTo()                                                              compare()

		ArrayList<Person>    personList = new ArrayList<Person>();
		
		Person person1 = new Person("adam", 21, 4500, 10000, 2);
		personList.add(person1);
		
		personList.add(new Person("ana", 41, 6500, 11000, 1));
		
		personList.add(new Person("joy", 33, 3200, 12000, 1));
		
		personList.add(new Person("roy", 54, 1500, 1000000, 4));
		
	   for(Person p : personList) {
		   System.out.println(p.toString());
	   }
	 
	   Collections.sort(personList);
	   
	   System.out.println("-----------------------------------------------------------");
	   for(Person p : personList) {
		   System.out.println(p.toString());
	}
	   
	   
	   Collections.sort(personList, new PersonSalaryComparator());
	   
	   System.out.println("-----------------------------------------------------------");
	   for(Person p : personList) {
		   System.out.println(p.toString());
	     }
	   
	   
	   Collections.sort(personList, new PersonNetWorthCompataor());
	   
	   System.out.println("-----------------------------------------------------------");
	   for(Person p : personList) {
		   System.out.println(p.toString());
	     }
	   
	}
}
