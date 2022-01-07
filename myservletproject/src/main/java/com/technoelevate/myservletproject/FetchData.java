package com.technoelevate.myservletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FetchData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter writer = res.getWriter();
		String parameter = req.getParameter("username");
		String parameter2 = req.getParameter("password");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mani");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		String query="select username from UserNames where username=:username and password=:password";
		transaction.begin();
		Query createQuery = em.createQuery(query);	
		createQuery.setParameter("username", parameter);
		createQuery.setParameter("password", parameter2);
		String singleResult;
		try {
		 singleResult = (String) createQuery.getSingleResult();
		}catch(Exception e) {
		
			writer.println("<h1>enter correct inputs </h1>");
		}
		transaction.commit();
		
		writer.println("<h1>sucessfully login </h1>");
		
		
	}

}
