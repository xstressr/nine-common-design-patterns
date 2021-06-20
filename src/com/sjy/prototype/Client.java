package com.sjy.prototype;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		//	创建User原型对象
		User user = new User();
		user.setName("李三");
		user.setPassword("123456");
		ArrayList<String> phones = new ArrayList<String>();
		phones.add("17674553302");
		user.setPhones(phones);
		
		// copy一个user对象，并且对象的属性
		User user2 = user.clone();
		user2.setPassword("654321");
		
		// 查看俩个对象是否是一个
		System.out.println(user == user2);
		
		// 查看属性内容
		System.out.println(user.getName() + " | " + user2.getName());
		System.out.println(user.getPassword() + " | " + user2.getPassword());
		// 查看对于引用类型拷贝
		System.out.println(user.getPhones() == user2.getPhones());
	}
}
