package com.te.hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeesInfo {
	public static void main(String[] args) {
		Employees emp = new Employees();
		while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter empId");
		int empId=scanner.nextInt();
		if(empId==0) {
			System.out.println("Something went wrong");
			break;
		}
		System.out.println("Enter empName");
		String empName=scanner.next();
		System.out.println("Enter salary");
		double salary=scanner.nextDouble();
		System.out.println("Enter designation");
		String designation=scanner.next();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setSalary(salary);
		emp.setDesignation(designation);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(emp);
		transaction.commit();
		}
		
	
	}
}
