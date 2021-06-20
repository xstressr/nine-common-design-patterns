package com.sjy.proxyCglib;

public class Test {
	public static void main(String[] args) {
		CglibProxy cglibProxy = new CglibProxy();
		UserDao userDao = (UserDao) cglibProxy.getInstance(new UserDaoImpl());
		userDao.save();
	}
}
