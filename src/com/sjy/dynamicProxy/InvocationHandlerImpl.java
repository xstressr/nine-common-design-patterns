package com.sjy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//	每次生成动态代理类对象时，实现了InvocationHandler接口的调用处理器对象
public class InvocationHandlerImpl implements InvocationHandler {

	//	这其实业务实现类对象，用来调用具体的业务方法
	private Object target;
	
	//	通过构造函数传入目标对象
	public InvocationHandlerImpl(Object target) {
		this.target = target;
	}
	
	//	动态代理实际运行的代理方法
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("调用开始处理");
		//	下面invoke()方法是以反射的方式来创建对象，第一个参数是要创建的对象，
		//	第二个是构成方法的参数，由第二个参数来决定创建对象使用哪个构造方法
		Object result = method.invoke(target, args);
		System.out.println("调用结束处理");
		return result;
	}

}
