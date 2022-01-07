package com.technoelevate.springassignment;

public class Airport {
	String name;
	int noOfFlights;
	String terminals;
	Flights f;
	
	
	public Airport(String name, Flights f) {
		super();
		this.name = name;
		this.f = f;
	}

	public void setNoOfFlights(int noOfFlights) {
		this.noOfFlights = noOfFlights;
	}
	
	public void setTerminals(String terminals) {
		this.terminals = terminals;
	}
	public void start() {
		f.takeOff();
		System.out.println(name);
		System.out.println("happy journey");
		
	}
	
	
	
	
	

}
