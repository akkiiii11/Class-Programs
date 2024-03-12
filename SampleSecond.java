package com.classdemo;

class SampleDemo
{
	int x=5;
	
	public void SampleDemoMethod()
	{
		System.out.println("Value of x for SampleDemoMethod: " +x);
	}
}

public class SampleSecond {  //class declaration
	
	int x=10;  //variable declaration and initialization
	
	public void method1()  //method defination
	{
		System.out.println("Value of x for method 1: " +x); //logic in method
	}
	
	public void method2()
	{
		System.out.println("Value of x for method 2: " +x);
	}

	public static void main(String[] args) {

		SampleSecond ss1 = new SampleSecond(); //object get created
		ss1.method1();  //calling method
		ss1.method2();
		
		SampleDemo sm = new SampleDemo();
		sm.SampleDemoMethod();

	}

}
