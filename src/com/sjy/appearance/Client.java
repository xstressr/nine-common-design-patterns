package com.sjy.appearance;

public class Client {
	public static void main(String[] args) {
		
		// 普通模式需要这样
		AliSmsService aliSmsService = new AliSmsServiceImpl();
		EmailSmsService emailSmsService = new EmailSmsServiceImpl();
		WeiXinSmsService weiXinSmsService = new WeiXinSmsServiceImpl();
		
		aliSmsService.sendsms();
		emailSmsService.sendsms();
		weiXinSmsService.sendsms();
		
		//	利用外观模式简化方法
		new Computer().sendMsg();
	}
}
