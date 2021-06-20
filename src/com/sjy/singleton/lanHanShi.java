package com.sjy.singleton;

//	懒汉式
public class lanHanShi {

	
	// 类初始化时，不会初始化该对象，真正需要使用的时候才会创建该对象
	private static lanHanShi demo2;
	
	
	
	private lanHanShi() {
		System.out.println("私有Demo2构造参数初始化");
	}

	public synchronized static lanHanShi getInstance() {
		if (demo2 == null) {
			demo2 = new lanHanShi();
		}
		return demo2;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lanHanShi s1 = lanHanShi.getInstance();
		lanHanShi s2 = lanHanShi.getInstance();
		System.out.println(s1 == s2);
	}

}
