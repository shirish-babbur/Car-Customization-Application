package com.webonise.carbuilder;

public class EngineFactory extends AbstractCarFactory{

	@Override
	public ITypeOfCar getTypeOfCar(String TypeOfCar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICompany getCompany(String Company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEngine getEngine(String Engine) {
		if(Engine == null){
	         return null;
	      }		
	      
	      if(Engine.equalsIgnoreCase("v-10")){
	         return new V10();
	         
	      }else if(Engine.equalsIgnoreCase("v-5")){
	         return new V5();
	         
	      }else if(Engine.equalsIgnoreCase("v-8")){
	         return new V8();
	      }
	      
	      return null;
	}
	@Override
	public IColor getColor(String color) {
		return null;
	}

}
