package com.te.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter writer = res.getWriter();
		String parameter =req.getParameter("username");
		String parameter2 = req.getParameter("password");
		String[] parametervalues = req.getParameterValues("sports");
		for (int i = 0; i < parametervalues.length; i++) {
			writer.println(parametervalues[i]);
			
		}
		writer.println("welcome "+parameter);
		writer.println("password is  "+parameter2);
	}

}
