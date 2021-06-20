package com.sjy.singleton;

//	双重检测锁方式
public class Demo5 {

	private static Demo5 demo5;
	
	private Demo5() {
		System.out.println("私有Demo5构造参数初始化");
	}
	
	public static Demo5 getInstance() {
		if (demo5 == null) {
			synchronized (Demo5.class) {
				if (demo5 == null) {
					demo5 = new Demo5();
				}
			}
		}
		return demo5;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 s1 = Demo5.getInstance();
		Demo5 s2 = Demo5.getInstance();
		System.out.println(s1 == s2);
	}

}
