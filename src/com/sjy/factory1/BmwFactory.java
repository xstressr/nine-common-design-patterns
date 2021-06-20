package com.sjy.factory1;

public class BmwFactory implements CarFactory{
	public Car createCar() {
		return new Bmw();
	}
}
