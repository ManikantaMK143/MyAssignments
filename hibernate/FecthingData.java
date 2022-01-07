package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FecthingData {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		
		Employees find = createEntityManager.find(Employees.class,101);
		System.out.println(find);
		find.setSalary(35000.00);
		find.setEmpName("M.K");
		transaction.begin();
		transaction.commit();
		
		Employees find2 = createEntityManager.find(Employees.class,104);
		createEntityManager.remove(find2);
		transaction.begin();
		transaction.commit();
		System.out.println("Updated sucesfuuly");
	}

}
