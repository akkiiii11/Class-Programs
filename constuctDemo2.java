package com.classdemo;

class Demo
{
	public Demo()
	{
		
	}
	
//	private Demo(int a)
	
	public Demo(int a)
	{
		System.out.println("Value of a " +a*a);
	}
	
	public Demo(int a, int b)
	{
		System.out.println("Multiplication is " +a*b);
	}
	
	public Demo(int a, float b)
	{
		System.out.println("Multiplication is " + a*b);
	}
	
//	Demo d = new Demo();
	
//	void methodOne()
//	{
//		Demo d = new Demo();
//	}
}

public class constuctDemo2 {

	public static void main(String[] args) {

//		Demo d = new Demo();  //demo is a private class 
		
		Demo d = new Demo();
		Demo d1 = new Demo(3);
		Demo d2 = new Demo(3,9);
		Demo d3 = new Demo(3,9.1f);

	}

}
