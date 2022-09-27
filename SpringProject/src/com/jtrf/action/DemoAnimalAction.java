package com.jtrf.action;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jtrf.model.Animal;
import com.jtrf.model.SpringJavaConfig;

public class DemoAnimalAction {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		Animal animal = context.getBean("animal",Animal.class);
		animal.setId(1);
		animal.setName("elephant");
		animal.setContinent("Asia");
		
		System.out.println(animal.getId()+"\t"+animal.getName()+"\t"+animal.getContinent());
		context.close();
	}

}
