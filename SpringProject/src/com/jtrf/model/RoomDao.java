package com.jtrf.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value="roomDao") //<bean id="roomDao" class="com.jtrf.model.RoomDao"/>
public class RoomDao {
	
	@Autowired
	private Room room;
	
	public void showInfo() {
		System.out.println(room.getId()+"\t"+room.getName()+":\t"+room.getSize());
		
	}
}
