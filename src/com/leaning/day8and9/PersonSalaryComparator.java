package com.leaning.day8and9;

import java.util.Comparator;

public class PersonSalaryComparator implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		// TODO Auto-generated method stub
		return (int) (person1.salary - person2.salary);
	}

}
