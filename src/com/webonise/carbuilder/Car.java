package com.webonise.carbuilder;

public class Car {
	private String typeOfCar="";
	private String company="";
	private String engine="";
	private String color="";
	private int price=0;
	
	public String getTypeOfCar(){
		return typeOfCar;
	}
	public void setTypeOfCar(String TypeOfCar){
		typeOfCar=TypeOfCar;
	}
	public String getCompany(){
		return company;
	}
	public void setCompany(String Company){
		company=Company;
	}
	public String getEngine(){
		return engine;
	}
	public void setEngine(String Engine){
		engine=Engine;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String Color){
		color=Color;
	}
	public void sendPrice(int Price){
		price+=Price;
	}
	public void showComponants(){
		System.out.println("Your Custom Designed Car");
		System.out.println("Type Of Car:"+typeOfCar+"\nCompany:"+company+"\nEngine:"+engine);
		System.out.println("Color:"+color+"\nCost:"+price);
	}
}
