package com.te.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClass {
	public static void main(String[] args) {
		Boy boy = new Boy();
		boy.setBoyId(101);
		boy.setName("Manikanta");
		boy.setSalary(35000.00);
		
		Girl girl = new Girl();
		girl.setGirlId(1);
		girl.setName("kutty");
		girl.setBoy(boy);
		boy.setGirl(girl);
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("hello");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(boy);
		createEntityManager.persist(girl);
		transaction.commit();
		
	}

}
