package com.javacore.package1;

class Parent1
{
	int i;
	public void parentMethod()
	{
		System.out.println(i);
	}
}

class Child1 extends Parent1
{
	int j;
	public void childMethod()
	{
		System.out.println(j);
	}

}

public class SingleDemo {

	public static void main(String[] args) {
		
		Parent1 p = new Parent1();
		p.i = 10;
		p.parentMethod();
		
		Child1 c = new Child1();
		c.i = 20; // parent class property
		c.j = 30; // child class property
	
		c.parentMethod(); // parent class method
		c.childMethod();

	}

}
