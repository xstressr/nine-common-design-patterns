package com.sjy.appearance;

/*
 * 外观模式例子
 * - 用户注册完之后，需要调用阿里短信接口、邮件接口、微信推送接口
 * */

// 阿里短信消息
public interface AliSmsService {
	void sendsms();
}
