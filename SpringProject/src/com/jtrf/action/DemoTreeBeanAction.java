package com.jtrf.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jtrf.model.TreeBean;

public class DemoTreeBeanAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		TreeBean tree = context.getBean("tree",TreeBean.class);
		System.out.println("Name: "+tree.getName());
		System.out.println("Age: "+tree.getAge());
		
		context.close();
		
	}

}
