package com.webonise.carbuilder;

public class CompanyFactory extends AbstractCarFactory{

	@Override
	public ITypeOfCar getTypeOfCar(String TypeOfCar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICompany getCompany(String Company) {
		if(Company == null){
	         return null;
	      }		
	      
	      if(Company.equalsIgnoreCase("BMW")){
	         return new BMW();
	         
	      }else if(Company.equalsIgnoreCase("Audi")){
	         return new Audi();
	         
	      }else if(Company.equalsIgnoreCase("Mercedes")){
	         return new Mercedes();
	      }
	      
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
