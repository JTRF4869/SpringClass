package com.jtrf.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jtrf.model.WorkerService;

public class DemoWorkerAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		WorkerService workerService = context.getBean("workerService",WorkerService.class);
		
		workerService.printResult();
		
		context.close();
	}
}
