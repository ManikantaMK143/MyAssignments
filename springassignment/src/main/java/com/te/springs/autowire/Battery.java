package com.te.springs.autowire;

public class Battery {
	String name="Tosibha";

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Battery [name=" + name + "]";
	}
	
	

}
