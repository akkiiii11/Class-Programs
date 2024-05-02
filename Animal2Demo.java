package com.corejava.lab_3;

class Animal2
{
	public void makeSound()
	{
		System.out.println("Animal make Sounds");
	}
}

class Cat extends Animal2
{
	public void makeSound()
	{
		System.out.println("Cats Bark");
	}
}

public class Animal2Demo {

	public static void main(String[] args) {
		
		Animal2 a = new Animal2();
		a.makeSound();
		
		Cat c = new Cat();
		c.makeSound();

	}

}
