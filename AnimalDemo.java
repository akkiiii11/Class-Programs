package com.corejava.lab_3;

class Animal1
{
	public void move()
	{
		System.out.println("Animals can move");
	}
}

class Cheetah extends Animal1
{
	public void move()
	{
		System.out.println("Cheetahs can run");
	}
}

public class AnimalDemo {

	public static void main(String[] args) {
		
		Animal1 a = new Animal1();
		a.move();
		
		Cheetah c = new Cheetah();
		c.move();

	}

}
