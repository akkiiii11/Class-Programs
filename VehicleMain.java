package lab_5;

abstract class Vehicle
{
	abstract void startEngine();
	
	abstract void stopEngine();
}

class Car extends Vehicle
{

	@Override
	void startEngine() {
		
		System.out.println("Car engine Start.");
		
	}

	@Override
	void stopEngine() {

		System.out.println("Car engine Stop.");
		
	}
	
}

class Motorcycle extends Vehicle
{

	@Override
	void startEngine() {
		
		System.out.println("Motorcycle engine Start.");
		
	}

	@Override
	void stopEngine() {
		
		System.out.println("Motorcycle engine Stop.");
		
	}
	
}

public class VehicleMain {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.startEngine();
		c.stopEngine();
		
		Motorcycle m = new Motorcycle();
		m.startEngine();
		m.stopEngine();

	}

}
