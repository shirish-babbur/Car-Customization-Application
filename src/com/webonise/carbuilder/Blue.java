package com.webonise.carbuilder;

public class Blue implements IColor{
	private int price=6000;
	@Override
	public String getColor() {
		
		return "blue";
	}
	public int getPrice(){
		return price;
	}
}
