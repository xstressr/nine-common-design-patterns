package com.sjy.factory1;

public class Client {

	public static void main(String[] args) {
		Car audi = new AudiFactory().createCar();
		Car Bmw = new BmwFactory().createCar();
		audi.run();
		Bmw.run();
	}
}
