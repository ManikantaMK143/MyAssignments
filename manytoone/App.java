package com.te.manytoone;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		Kart kart =new Kart();
		kart.setProductId("101eGro");
		kart.setProductName("Grocaries");
		Items items = new Items();
		items.setItemId("1eAtta2");
		items.setItemName("Atta Powder");
		items.setCost(350.00);
		items.setItemQuantity("1 kg");
		
		Items items2 = new Items();
		items2.setItemId("2sMilk34");
		items2.setItemName("Milk Packets");
		items2.setCost(360.00);
		items2.setItemQuantity("6 liters");
		Items items3 = new Items();
		items3.setItemId("3cChoco66");
		items3.setItemName("Chocolates");
		items3.setCost(1000.00);
		items3.setItemQuantity("1 family pack");
		List<Items> list = Arrays.asList(items,items2,items3);
		kart.setItems(list);
		items.setKart(kart);
		items2.setKart(kart);
		items3.setKart(kart);
		
		
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("hello");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(kart);
		createEntityManager.persist(items);
		createEntityManager.persist(items2);
		createEntityManager.persist(items3);
		transaction.commit();
		createEntityManagerFactory.close();
		createEntityManager.close();
		
	}

}
