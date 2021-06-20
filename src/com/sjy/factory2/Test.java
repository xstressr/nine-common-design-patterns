package com.sjy.factory2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TotalFactory totalFactory2 = new TotalFactoryReally();
		Car car = totalFactory2.createCar();
		car.run();
		
		TotalFactory totalFactory = new TotalFactoryReally();
		Engine engine = totalFactory.createEngine();
		engine.run();
	}

}
