package com.te.springs.autowire;

public class Screen {
	String name="AMOLED";

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Screen [name=" + name + "]";
	}
	

}
