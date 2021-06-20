package com.sjy.factory2;

public interface Engine {
	void run();
}


class EngineA implements Engine {
	public void run() {
		System.out.println("转的快！");
	}
}


class EngineB implements Engine {
	public void run() {
		System.out.println("转的慢！");
	}
}