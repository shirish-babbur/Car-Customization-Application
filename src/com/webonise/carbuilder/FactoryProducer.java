package com.webonise.carbuilder;

public class FactoryProducer {

	public static AbstractCarFactory getFactory(String Choice){
		 if(Choice.equalsIgnoreCase("Company")){
	         return new CompanyFactory();
	         
	      }else if(Choice.equalsIgnoreCase("Type")){
	         return new TypeFactory();
	         
	      }else if(Choice.equalsIgnoreCase("Engine")){
		         return new EngineFactory();
		         
		  }else if(Choice.equalsIgnoreCase("Color")){
		         return new ColorFactory();
		         
		  }
	      
	      return null;
	   }
}
