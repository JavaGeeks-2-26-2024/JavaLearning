package com.leaning.day3;

public class TV {
	
//	Tv -> has Attributes -> type, model, os, size, mfgYear, specs, color
//  has Methods -> chnageChannel(), swich(), operations(), volume()
//	              -> getType() => return type
//	              -> getOs() => return os
//	              -> getMfgYear()   => return mfgYear
//	              -> updateColor()  => take a input color to update
//	              -> updateModel()  => take a input model to update
	
	String type; 
	String model;
	String os;
	double size;
	int mfgYear;
	String specs;
	String color;
	int channelNo;
	
public 	TV() {
	
}
	
	
//	chnageChannel(), swich(), operations(), volume()
	
	public void changeChannel(int newchannelNo) {
		channelNo = newchannelNo;
		
	}
	
	public String getType() {
		return type;
	}
	
	public String getOs() {
		return os;
	}
	
	public int getMfgYear() {
		return mfgYear;
	}
	
//    -> updateColor()  => take a input color to update
//    -> updateModel()  => take a input model to update
	
	public void updateColor(String inputColor) {
		    color = inputColor;
	}
	
	public void updateModel(String inputModel) {
		model = inputModel;
	}


}
