package com.sjy.factory1;

public class AudiFactory implements CarFactory{
	public Car createCar() {
		return new Audi();
	}
}
