package com.sjy.factory2;

public interface TotalFactory {

	//	创建汽车
	Car createCar();
	//	创建发动机
	Engine createEngine();
}

//	总工厂实现类，由他决定调用哪个工厂的哪个实例
class TotalFactoryReally implements TotalFactory {
	public Engine createEngine() {
		return new EngineA();
	}
	
	public Car createCar() {
		return new CarA();
	}
}
