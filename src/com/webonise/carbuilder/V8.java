package com.webonise.carbuilder;

public class V8 implements IEngine{
	private int price=20000;
	public String getEngine(){
		return "V-8";
	}
	public int getPrice(){
		return price;
	}
}
