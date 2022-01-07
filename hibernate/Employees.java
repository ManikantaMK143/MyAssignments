package com.te.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
	@Id
	private int empId;
	private String empName;
	private double salary;
	private String designation;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
	

}
