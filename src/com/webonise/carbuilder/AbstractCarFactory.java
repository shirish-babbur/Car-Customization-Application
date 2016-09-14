package com.webonise.carbuilder;

public abstract class AbstractCarFactory {

	public abstract ITypeOfCar getTypeOfCar(String TypeOfCar);
	public abstract ICompany getCompany(String Company);
	public abstract IEngine getEngine(String Engine);
	public abstract IColor getColor(String color);
}
