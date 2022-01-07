package com.te.springs.autowire;

public class Laptop {
	Battery b;
	Screen s;
	HardDisk hd;
	HardDisk hd1;
	
	
	
//public Laptop(Battery b, Screen s, HardDisk hardDisk, HardDisk hd1) {
//		super();
//		this.b = b;
//		this.s = s;
//		this.hd = hardDisk;
//		this.hd1 = hd1;
//	}



	public void setHd1(HardDisk hd1) {
		this.hd1 = hd1;
	}
	public void setHd(HardDisk hd) {
		this.hd = hd;
	}
	public void setB(Battery b) {
		this.b = b;
	}
	public void setS(Screen s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "Laptop [b=" + b + ", s=" + s + ", hardDisk=" + hd + ", hd1=" + hd1 + "]";
	}
	
	
	
	

}
