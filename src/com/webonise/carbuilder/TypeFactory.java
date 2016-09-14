package com.webonise.carbuilder;

public class TypeFactory extends AbstractCarFactory{

	@Override
	public ITypeOfCar getTypeOfCar(String TypeOfCar) {
		if(TypeOfCar == null){
	         return null;
	      }		
	      
	      if(TypeOfCar.equalsIgnoreCase("SUV")){
	         return new SUV();
	         
	      }else if(TypeOfCar.equalsIgnoreCase("Sedan")){
	         return new Sedan();
	         
	      }else if(TypeOfCar.equalsIgnoreCase("Sports")){
	         return new Sports();
	      }
	      
	      return null;
	}

	@Override
	public ICompany getCompany(String Company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEngine getEngine(String Engine) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public IColor getColor(String color) {
		return null;
	}
}
