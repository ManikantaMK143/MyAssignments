package com.te.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlQuery {
	public static void main(String[] args) {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("hello");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
//		String query = "from Employees";
//		Query createQuery = createEntityManager.createQuery(query);
//		List<Employees> list = createQuery.getResultList();
//		for (Employees employees : list) {
//			System.out.println(employees);
//
//		}
//		System.out.println("==============================");
//		String query2 = "select min(salary) from Employees";
//		Query query3 = createEntityManager.createQuery(query2);
//		Double resultList = (Double) query3.getSingleResult();
//		System.out.println(resultList);
		
		String query5 = "DROP TABLE Employees";
		Query query4 = createEntityManager.createQuery(query5);
		List resultList2 = query4.getResultList();
		System.out.println(resultList2);
		System.out.println("droped sucsefful");

	}

	
	
	

}
