package com.javacore.class_program;

import java.util.Arrays;

public class ArrayInJava3 {

	public static void main(String[] args) {

		int[] a = {12,21,0,5,7};
		
		//creating a copy of array 'a' using copyof() method of java.
		int[] b = Arrays.copyOf(a, a.length);
		
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		//Now changing values of one array will not reflect in other 
		a[2] = 56;
		System.out.println(b[2]);
		
		b[4] = 100;
		System.out.println(a[4]);

	}

}
