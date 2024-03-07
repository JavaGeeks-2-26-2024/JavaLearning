package com.leaning.day8and9;

public class Person  implements Comparable<Person>{
	
	String name;
	int age;
	double salary;
	double netWorth;
	int noOfHouse;
	
	
	
	
	public Person(String name, int age, double salary, double netWorth, int noOfHoues) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.netWorth = netWorth;
		this.noOfHouse = noOfHoues;
	}




	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + ", netWorth=" + netWorth
				+ ", noOfHouse=" + noOfHouse + "]";
	}




	@Override
	public int compareTo(Person person) {  
		return this.age - person.age;
	}

}
