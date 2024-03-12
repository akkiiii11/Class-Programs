package com.javacore.class_program;

public class ArrayInJava5 {

	public static void main(String[] args) {
		
		int[] a = {12,21,0,5,7};
		
		int[] b = new int[a.length];
		
		System.arraycopy(a, 0, b, 0, 4);
		
		for(int i = 0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}

	}

}
