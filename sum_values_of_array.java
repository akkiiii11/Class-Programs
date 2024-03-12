package com.javacore.class_program;

public class sum_values_of_array {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		int sum = 0,i;
		
		for(i = 0; i < a.length; i++)
		{
			sum = sum + a[i];
		}
		
		System.out.println("The sum values of array is: " +sum);

	}

}
