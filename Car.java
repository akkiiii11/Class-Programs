package com.classdemo;

public class Car {
	
	public void fullThrottle()
	{
		System.out.println("The car is at fullThrottle.");
	}
	
	public void speed()
	{
		System.out.println("The car speed is 50 km/h.");
	}

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.fullThrottle();
		myCar.speed();

	}

}
