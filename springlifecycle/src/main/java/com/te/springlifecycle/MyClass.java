package com.te.springlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyClass {
	public static void main(String[] args) {
	  ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
	Demo bean= (Demo) context.getBean("demo"); 
	bean.name();
	context.close();
		
	}

}
