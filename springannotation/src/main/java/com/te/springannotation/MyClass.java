package com.te.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springannotation.xml");
		Salary bean = context.getBean(Salary.class);
		System.out.println(bean);
	}

}
