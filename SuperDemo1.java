package com.javacore.package1;

class SuperParent
{
	String name;
	
	public void details()
	{
		name = "Parent";
		System.out.println(name);
	}
}
public class SuperDemo1 extends SuperParent{
	
	String name;
	
	public void details()
	{
		super.details();
		name = "Child";
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		SuperDemo1 sd = new SuperDemo1();
		sd.details();

	}

}
