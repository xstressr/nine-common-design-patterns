package com.sjy.singleton;

//	静态内部类方式
public class staticInner {

	private staticInner() {
		System.out.println("私有Demo3构造函数初始化");
	}
	
	public static class SingletonClassInstance {
		private static final staticInner DEMO_3 = new staticInner();
	}
	
	//方法没有同步
	public static staticInner getInstance() {
		return SingletonClassInstance.DEMO_3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticInner s1 = staticInner.getInstance();
		staticInner s2 = staticInner.getInstance();
		System.out.println(s1 == s2);
	}

}
