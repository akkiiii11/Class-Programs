package com.corejava.lab_3;

class Vehicle
{
	public void drive()
	{
		System.out.println("Repairing a Vehicle");
	}
}

class Car extends Vehicle
{
		public void drive()
		{
			System.out.println("Repairing a Car");
		}
}

public class VehicleDemo {

	public static void main(String[] args) {
	
		Vehicle v = new Vehicle();
		Car c = new Car();
		
		v.drive();
		c.drive();
	
	}

}
