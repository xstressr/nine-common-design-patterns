package com.sjy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
//		被代理对象
		UserDao UserDaoImpl = new UserDaoImpl();
		InvocationHandlerImpl invocationHandlerImpl = new InvocationHandlerImpl(UserDaoImpl);
		
		//	类加载器
		ClassLoader loader = UserDaoImpl.getClass().getClassLoader();
		Class<?>[] interfaces = UserDaoImpl.getClass().getInterfaces();
		
		//	主要装载器、一组接口及调用处理动态代理实例
		UserDao newProxyInstance = (UserDao) Proxy.newProxyInstance(loader, interfaces, invocationHandlerImpl);
		newProxyInstance.save();
	}
}
