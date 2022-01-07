package com.te.springlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class Demo implements InitializingBean,DisposableBean {
	public Demo() {
		System.out.println("inisitained");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("from set properties");
		
	}
	public void name() {
		System.out.println("After set propetties");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destorying the bean");
		
	}

}
