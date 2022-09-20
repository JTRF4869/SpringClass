package com.jtrf.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value="roomService")
//<bean id="roomService" class="com.jtrf.model.RoomService"/>
public class RoomService {
	
	@Autowired
	private RoomDao roomDao;
	
	public void showInfo() {
		roomDao.showInfo();
	}
}
