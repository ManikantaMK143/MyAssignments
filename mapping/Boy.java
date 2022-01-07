package com.te.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Boy {
	@Id
	private int boyId;
	private String name;
	private double salary;
	@OneToOne
	private Girl girl;
	public int getBoyId() {
		return boyId;
	}
	public void setBoyId(int boyId) {
		this.boyId = boyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Girl getGirl() {
		return girl;
	}
	public void setGirl(Girl girl) {
		this.girl = girl;
	}
	@Override
	public String toString() {
		return "Boy [boyId=" + boyId + ", name=" + name + ", salary=" + salary + ", girl=" + girl + "]";
	}
	
	
	

}
