package com.te.servletandhibernate;

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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.jandex.Main;

public class MyServlet extends HttpServlet {

	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)   throws ServletException, IOException{
		UserName name = new UserName();
	

		String parameter = req.getParameter("username");
		String parameter2 = req.getParameter("password");
		
		PrintWriter writer = resp.getWriter();
		writer.println("user name="+(parameter));
		writer.println("password is="+(parameter2));
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
