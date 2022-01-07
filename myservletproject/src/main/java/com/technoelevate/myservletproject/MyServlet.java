package com.technoelevate.myservletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		

		String parameter = req.getParameter("username");
		String parameter2 = req.getParameter("password");
		
		 PrintWriter writer = res.getWriter();
		writer.println("user name="+(parameter));
		writer.println("password ="+(parameter2));
		
		
		
		UserNames name = new UserNames();
		
		   name.setUsername(parameter);
		   name.setPassword(parameter2);
		   EntityManagerFactory emf = Persistence.createEntityManagerFactory("mani");
			EntityManager em = emf.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			
			
			
			transaction.begin();
			
			em.persist(name);
			
			transaction.commit();
			em.close();
			emf.close();
		   
		   
		
		
		
		
		
		
	}

}
