package com.jtrf.model;

import org.springframework.stereotype.Component;

@Component(value="room") //<bean id="room" class="com.jtrf.model.Room">
public class Room {
	private int id;
	private String name;
	private String size;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
}
