package com.classdemo;

//passing Array of Primitive Type as a parameter to the Method
public class ArrayInJava8 {
	
	static void methodOne(double d[])
	{
		d[2] = 25.35;
		d[5] = 45.35;
	}

	public static void main(String[] args) {

		//declaring and Creating an array object of double type containing of 8 elements
		double[] d = new double[8];
		
		d[2] = 10.25;	//changing the value of element at index 2
		d[5] = 15.25;	//changing the value of element at index 5
		
		methodOne(d);
		System.out.println(d[2]);
		System.out.println(d[5]);

	}

}
