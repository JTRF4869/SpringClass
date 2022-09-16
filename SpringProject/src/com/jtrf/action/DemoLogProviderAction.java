package com.jtrf.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jtrf.util.LogProvider;

public class DemoLogProviderAction {

	
		public static void main(String[] args) {
			//讀取組態檔
			ApplicationContext context= new ClassPathXmlApplicationContext("beans.config.xml");
			
			
			//透過id 向Spring 要求一個Bean
			LogProvider logger = (LogProvider) context.getBean("logProvider");
			logger.log("Have a nice day");
			((ConfigurableApplicationContext)context).close();
		}
}
