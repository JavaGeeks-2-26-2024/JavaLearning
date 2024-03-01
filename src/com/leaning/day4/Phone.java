package com.leaning.day4;

public class Phone {
	
	String type; 
	String model;
	String os;
	double size;
	int mfgYear;
	String specs;
	String color;

	// color;model;os;mfgYear;
	
	public Phone(String inputColor, String inputModel, String inputOs, int inputmfgYear ) {
		color = inputColor;
		model = inputModel;
		os = inputOs;
		mfgYear = inputmfgYear;
	}
	
	
	public void changeColor(String inputcolor) {
		color = inputcolor;
	}
	
	
	
}
