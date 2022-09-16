package com.jtrf.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoStringAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		String string0 = context.getBean("string0",String.class);
		System.out.println("String "+string0);
		
		
		//Alias
		String string1 = context.getBean("string0",String.class);
		System.out.println("String "+string1);
		String string2 = context.getBean("string0",String.class);
		System.out.println("String "+string2);
		context.close();
	}
}
