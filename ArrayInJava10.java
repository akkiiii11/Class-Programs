package com.classdemo;

public class ArrayInJava10 {
	
	static int[] methodOne() 
	{
		int [] a = new int[8];
		a[2] = 10;
		a[5] = 20;
		return a;
	}
	
	public static void main()
	{
		int a[] = methodOne();
		System.out.println(a[2]);
		System.out.println(a[5]);
		
	}

}
