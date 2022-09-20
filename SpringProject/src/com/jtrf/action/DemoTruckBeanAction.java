package com.jtrf.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jtrf.model.TruckBean;

public class DemoTruckBeanAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		TruckBean toyotaTruck = (TruckBean) context.getBean("toyotaTruck");
		System.out.println("Id:"+toyotaTruck.getId());
		System.out.println("Brand:"+toyotaTruck.getBrand());
		
		TruckBean nissanTruck = (TruckBean) context.getBean("nissanTruck");
		System.out.println("Id:"+nissanTruck.getId());
		System.out.println("Brand:"+nissanTruck.getBrand());
		
		TruckBean ferrariTruck = (TruckBean) context.getBean("ferrariTruck");
		System.out.println("Id:"+ferrariTruck.getId());
		System.out.println("Brand:"+ferrariTruck.getBrand());
		
		TruckBean subaruTruck = (TruckBean) context.getBean("subaruTruck");
		System.out.println("Id:"+subaruTruck.getId());
		System.out.println("Brand:"+subaruTruck.getBrand());
		
		
		context.close();
	}

}
