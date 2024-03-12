package com.classdemo;

public class ExampleMinNumber {
	
	//accessspecifier return type name of the function(parameter list)
	public int minFunction(int n, int m)  //n=a, m=b
	{
		int min;
		if(n>m)
		{
//			System.out.println("The Minimum Value is: " +m);
			min=m;
		}
		
		else
		{
//			System.out.println("The Minimum Value is: " +n);
			min=n;
		}
		return min;
		
	}

	public static void main(String[] args) {

		int a = 11;
		int b = 6;
		
		ExampleMinNumber obj = new ExampleMinNumber();
		
		int c = obj.minFunction(a, b);
		
		System.out.println("Minimum Value " +c);
		
//		obj.minFunction(a, b);
		
		

	}

}
