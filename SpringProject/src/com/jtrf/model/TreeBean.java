package com.jtrf.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tree")
@Scope("singleton")
@PropertySource("classpath:tree.properties")
public class TreeBean {
	
//	@Value("#{props.age}")
	@Value("${age}")
	private int age;
	
//	@Value("#{props.name}")
	@Value("${name}")
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
