package com.te.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springsbeanannotation.Cat;
import com.te.springsbeanannotation.Dog;
import com.te.springsbeanannotation.Pet;
import com.te.springsbeanannotation.Praveen;

@Configuration

public class MyConfigClass {
	
	@Bean("Dog")

	public Dog getDog() {
		
		return new Dog();
		
	}
	@Bean("Cat")
	public Cat getCat() {
		return new Cat();
		
	}
	@Bean("Praveen")
	@Primary
	public Praveen getPraveen() {
		return new Praveen();
		
	}
	@Bean
	public Pet getPet() {
		return new Pet();
		
	}

	
}
