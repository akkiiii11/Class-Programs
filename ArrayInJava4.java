package com.javacore.class_program;

public class ArrayInJava4 {

	public static void main(String[] args) {
		
		//creating a copy of array 'a' using copyof() method of java.
		int[] a = {12,21,0,5,7};
		
		int[] b = a.clone(); //Creates and returns a copy of this object. 
		
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		/*
		 Now changing values of one array will not reflect in other array
		 
		a[2] = 56;
		System.out.println(b[2]);  //value of 3rd element in array 'b' will not change
		
		b[4] = 100;
		System.out.println(a[4]);  //Changing value of 5th element in array 'b'
		*/ 
	}

}
