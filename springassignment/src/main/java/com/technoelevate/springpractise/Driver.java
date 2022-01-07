package com.technoelevate.springpractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");
		Car bean = context.getBean(Car.class);
		bean.start();
	}

}
