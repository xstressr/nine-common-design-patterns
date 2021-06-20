package com.sjy.template;

/*
 * 1.什么是模板方法
 * - 模板方法模式：定义一个操作中的算法骨架（父类），而将一些步骤延迟到子类中。模板方法使得
 * 子类可以不改变一个算法的结构来重定义该算法的
 * 
 * 2.什么时候使用模板方法
 * - 实现一些操作时，整体步骤很固定，但是呢。就是其中一小部分需要改变，这时候可以使用模板方法模式，将
 * 容易变得部分抽象出来，供子类实现。
 * 
 * 3.实际开发中应用场景哪里用到了模板方法
 * - 其实很多框架中都有用到了模板方法模式
 * - 例如： 数据库访问的封装、Junit单元测试、servlet中关于doGet/doPost方法的调用等等
 * */
public abstract class RestaurantTemplate {
	// 1. 看菜单那
	public void menu() {
		System.out.println("看菜单");
	}
	
	// 2.点菜业务
	abstract void spotMenu();
	
	// 3.吃饭业务
	public void havingDinner() {
		System.out.println("吃饭");
	}
	
	// 4.付款业务
	abstract void payment();
	
	// 5.走人
	public void GoR() {
		System.out.println("走人");
	}
	
	public void process() {
		menu();
		spotMenu();
		havingDinner();
		payment();
		GoR();
	}
}
