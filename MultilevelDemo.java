package com.javacore.package1;

class Animal
{
	public void eat()
	{
		System.out.println("Eating...");
	}
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Barking...");
	}
}

class BabyDog extends Dog
{
	public void weep()
	{
		System.out.println("weeping...");
	}
}

public class MultilevelDemo {

	public static void main(String[] args) {
		
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
		

	}

}
