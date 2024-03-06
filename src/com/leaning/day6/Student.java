package com.leaning.day6;

public class Student {

	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public boolean equals(Student student) {

		return (student.name == this.name) && (student.id == this.id);
	}

	@Override
	public String toString() {

		return this.id + " " + this.name;
	}

}
