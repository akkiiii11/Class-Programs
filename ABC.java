package com.javacore.package1;

class GrandParent
{
	int z;
	public void grandParentMethod()
	{
		System.out.println(z);
	}
}

class Parent extends GrandParent
{
	int i;
	public void parentMethod()
	{
		System.out.println(i);
	}
}

class Child extends Parent
{
	int j;
	public void childMethod()
	{
		System.out.println(j);
	}

}

public class ABC {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.i = 10;
		p.parentMethod();
		
		Child c = new Child();
		c.i = 20; // parent class property
		c.j = 30; // child class property
	
		c.parentMethod(); // parent class method
		c.childMethod(); // child class method
	

	}

}
