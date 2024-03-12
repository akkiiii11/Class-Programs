package com.corejava.class_practice_program;

import java.util.Scanner;

public class SumOfDigits {
	
	int number;
	
	SumOfDigits(int n){
		
		number = n;
		
	}
	
	public int SumDigit()
	{
		int sum = 0;
		
		while(number != 0)
		{
			sum = sum + number %10;
			number = number /10;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		SumOfDigits sd = new SumOfDigits(n);
		System.out.println("Sum of Digits is: " +sd.SumDigit());
		

	}

}
