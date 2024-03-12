package com.javacore.class_program;

public class average_value_of_array {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		
		int sum = 0, average = 0,i;
		
		for(i = 0; i < a.length; i++)
		{
			sum = sum + a[i];
			average = sum/a[i];
		}
		
		System.out.println("The average value of array elements is: " +average);
	}

}
