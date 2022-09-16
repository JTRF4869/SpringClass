package com.jtrf.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jtrf.model.LoginService;

public class DemoLoginAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		LoginService loginService1 = context.getBean("loginService1",LoginService.class);
		boolean result1 = loginService1.checkLogin("John","test123");
		System.out.println("Result1: "+result1);
		
		LoginService loginService2 = context.getBean("loginService2",LoginService.class);
		boolean result2 = loginService2.checkLogin("John","test12");
		System.out.println("Result2: "+result2);
		
		context.close();
	}

}
