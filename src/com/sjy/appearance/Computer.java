package com.sjy.appearance;

public class Computer {
	AliSmsService aliSmsService;
	EmailSmsService emailSmsService;
	WeiXinSmsService weiXinSmsService;
	
	public Computer() {
		aliSmsService = new AliSmsServiceImpl();
		emailSmsService = new EmailSmsServiceImpl();
		weiXinSmsService = new WeiXinSmsServiceImpl();
	}
	
	// 只需要调用它
	public void sendMsg() {
		aliSmsService.sendsms();
		emailSmsService.sendsms();
		weiXinSmsService.sendsms();
	}
}
