package com.technoelevate.springpractise;

public class Car {
	String modelName;
	double cost;
	String capacity;
	ManufacturingUnit e;
	
	public Car(double cost, ManufacturingUnit e) {
		super();
		this.cost = cost;
		this.e = e;
	}
	

	


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
 
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}


	public void start() {
		e.carReadyToLaunch();
		System.out.println(modelName+" car is ready start with the capacity of "+capacity);
	}
	

}
