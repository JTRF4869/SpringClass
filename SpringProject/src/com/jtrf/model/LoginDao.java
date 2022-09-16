package com.jtrf.model;

public class LoginDao {
	
	
	public boolean checkLogin(String user,String pwd) {
		
		//if user null pwd = null
		
//		if(user.equals("John")&&pwd.equals("test123"))
//			return true;
//		return false;
		
		
		if("John".equals(user)&&"test123".contentEquals(pwd))
			return true;
		return false;
	}
	
	
}
