package com.javacore.package1;

class SuperPrime
{
	String name1;
}

public class SuperDemo extends SuperPrime
{
	String name;
	
	public void details()
	{
		super.name1 = "Parent";
		name = "Child";
		System.out.println(super.name1);
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		SuperDemo obj = new SuperDemo();
		obj.details();
		

	}

}
