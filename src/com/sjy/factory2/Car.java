package com.sjy.factory2;

public interface Car {
	void run();
}


class CarA implements Car{
	public void run() {
		System.out.println("宝马");
	}
}

class CarB implements Car{
	public void run() {
		System.out.println("摩拜");
	}
}

/*什么是抽象工厂模式
 * 抽象工厂简单地说是工厂的工厂，抽象工厂可以创建具体工厂，由具体工厂来产生具体产品
 * 
 */
