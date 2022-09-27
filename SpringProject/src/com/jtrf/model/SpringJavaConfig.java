package com.jtrf.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringJavaConfig {
	
	@Bean
	public Animal animal() {
		Animal a1= new Animal();
		return a1;
	}
	
}
