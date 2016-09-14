package com.webonise.carbuilder;

public class Red implements IColor{
	private int price=4000;
	@Override
	public String getColor() {
		return "red";
	}
	public int getPrice(){
		return price;
	}
}
