package com.jtrf.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jtrf.model.Room;
import com.jtrf.model.RoomDao;
import com.jtrf.model.RoomService;

public class DemoRoomAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		Room room = context.getBean("room",Room.class);
		room.setId(100);
		room.setName("War Room");
		room.setSize("medium");
		
		System.out.println(room.getId()+"\t"+room.getName()+":\t"+room.getSize());
		
		RoomDao dao = context.getBean("roomDao",RoomDao.class);
		dao.showInfo();
		
		RoomService rs = context.getBean("roomService",RoomService.class);
		rs.showInfo();
		context.close();
	}

}
