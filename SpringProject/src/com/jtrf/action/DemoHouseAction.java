package com.jtrf.action;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jtrf.model.House;
import com.jtrf.model.HouseService;

public class DemoHouseAction {

	public static void main(String[] args) throws SQLException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		HouseService houseService = context.getBean("houseService",HouseService.class);
		House resultBean = houseService.findById(1001);
		if(resultBean != null) 
			System.out.println(resultBean.getHouseId()+" "+resultBean.getHousename());
		else
			System.out.println("No such data!");
		context.close();
	}
}
