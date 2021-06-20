package com.sjy.factory;

public class CarFactory {
	public static Car createCar(String name) {
		if ("".equals(name)) {
			return null;
		}
		if(name.equals("奥迪")) {
			return new Audi();
		}
		if(name.equals("宝马")) {
			return new Bmw();
		}
		return null;
	}
}
