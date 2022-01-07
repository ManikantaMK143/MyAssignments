package com.te.springsbeanannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.somthing.Test;

import com.te.springconfig.NewConfig;
import com.te.springtest.Demo;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(NewConfig.class);
		Pet bean = context.getBean(Pet.class);
		bean.doThings();
		
		Test bean3 = context.getBean(Test.class);
		System.out.println(bean3);
		Demo demo = context.getBean(Demo.class);
		System.out.println(demo);
	}
}
