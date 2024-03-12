package com.javacore.package1;

public class ThisClass2 {
	
	int a;
	int b;
	
	ThisClass2()
	{
		a=10;
		b=20;
	}
	
	public void display(ThisClass2 test)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public void get()
	{
		display(this);
	}
	
	public static void main(String[] args) {

		ThisClass2 ts = new ThisClass2();	//object
		
//		ThisClass ts //Reference
		
		ts.get();
	}

}
