package com.webonise.carbuilder;

public class ColorFactory extends AbstractCarFactory{

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IColor getColor(String color) {
		if(color == null){
	         return null;
	      }		
	      
	      if(color.equalsIgnoreCase("red")){
	         return new Red();
	         
	      }else if(color.equalsIgnoreCase("blue")){
	         return new Blue();
	         
	      }
	      return null;
	}


}
