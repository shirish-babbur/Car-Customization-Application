package com.webonise.carbuilder;

import java.util.Scanner;

public class CarBuilder {

	public static void main(String[] args) {
		
		Car customCar=new Car();
		Scanner input=new Scanner(System.in);
		String user_input="";
		
		System.out.println("Select Car Type:\n1.Sports\n2.Sedan\n3.SUV");
		user_input=input.nextLine();
		AbstractCarFactory typefactory=FactoryProducer.getFactory("Type");
		ITypeOfCar typeOfCar=typefactory.getTypeOfCar(user_input);
		customCar.setTypeOfCar(typeOfCar.getTypeOfCar());
		
		System.out.println("Select Car Company:\n1.BMW\n2.Audi\n3.Mercedes");
		user_input=input.nextLine();
		AbstractCarFactory companyFactory=FactoryProducer.getFactory("Company");
		ICompany company=companyFactory.getCompany(user_input);
		customCar.setCompany(company.getCompany());
		
		System.out.println("Select Car Engine:\n1.V-5\n2.V-8\n3.V-10");
		user_input=input.nextLine();
		AbstractCarFactory engineFactory=FactoryProducer.getFactory("Engine");
		IEngine engine=engineFactory.getEngine(user_input);
		customCar.sendPrice(engine.getPrice());
		customCar.setEngine(engine.getEngine());
		
		System.out.println("Select Car Color:\n1.Red\n2.Blue");
		user_input=input.nextLine();
		AbstractCarFactory colorFactory=FactoryProducer.getFactory("Color");
		IColor color=colorFactory.getColor(user_input);
		customCar.sendPrice(color.getPrice());
		customCar.setColor(color.getColor());
		
		customCar.showComponants();
	}

}
