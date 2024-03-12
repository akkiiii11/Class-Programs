package com.javacore.package1;

class Vehicle1
{
	public void drive()
	{
		System.out.println("Repairing a Vehicle");
	}
}

class Car1 extends Vehicle1
{
		public void drive()
		{
			System.out.println("Repairing a Car");
		}
}

public class VehicleDemo {

	public static void main(String[] args) {
	
		Vehicle1 v = new Vehicle1();
		Car1 c = new Car1();
		
		v.drive();
		c.drive();
	
	}

}
