package com.sjy.singleton;

// 饿汉式
public class eHanShi {

	// 类初始化时，会立即加载该对象，线程安全，调用效率高
	private static eHanShi demo1 = new eHanShi();
	
	private eHanShi() {
		System.out.println("私有Demo1构造参数初始化");
	}
	
	public static eHanShi getInstance() {
		return demo1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eHanShi s1 = eHanShi.getInstance();
		eHanShi s2 = eHanShi.getInstance();
		System.out.println(s1 == s2);
	}

}
