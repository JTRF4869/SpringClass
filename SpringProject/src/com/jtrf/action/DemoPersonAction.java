package com.jtrf.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jtrf.model.Person;

public class DemoPersonAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
//		Person person1 = context.getBean("person1",Person.class);
//		System.out.println(person1.getName()+": "+person1.getAge());
//		
//		Person person2 = context.getBean("person2",Person.class);
//		System.out.println(person2.getName()+": "+person2.getAge());
//		System.out.println("date: "+person2.getMydate());
//		
//		Person person3 = context.getBean("person3",Person.class);
//		System.out.println(person3.getName()+": "+person3.getAge());
//		
//		Person person4 = context.getBean("person4",Person.class);
//		System.out.println(person4.getName()+": "+person4.getAge()+" "+person4.getMydate());
		
		Person person5 = context.getBean("person1",Person.class);
		Person person6 = context.getBean("person1",Person.class);
		
		System.out.println(person5.hashCode());
		System.out.println(person6.hashCode());
		context.close();
	}

}
