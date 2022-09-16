package com.jtrf.model;

public class LoginService {
	
	private LoginDao loginDao;
	
	public LoginService() {
	}
	
	
//	Constructor DI
	public LoginService(LoginDao loginDao ) {
		this.loginDao = loginDao ;
	}
	
//	Setter DI (Property DI)
//	必須搭配不帶參數值的建構子
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}


	public boolean checkLogin(String user,String pwd) {
		return loginDao.checkLogin(user, pwd);
	}
	
}
