package com.sjy.proxy;

public class Test {
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		userDao.save();
		UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
		userDaoProxy.save();
	}
}
