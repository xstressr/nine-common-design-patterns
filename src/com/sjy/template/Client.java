package com.sjy.template;

public class Client {
	
	public static void main(String[] args) {
		RestaurantTemplate restaurantTemplate = new RestaurantGinsengImpl();
		restaurantTemplate.process();
		RestaurantTemplate restaurantTemplate2 = new RestaurantLobsterImpl();
		restaurantTemplate2.process();
	}
}
