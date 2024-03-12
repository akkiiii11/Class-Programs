package com.corejava.class_practice_program;

import java.util.Scanner;

public class ThreeInteger {
	
	int num1;
	int num2;
	int num3;
	
	ThreeInteger(int n1, int n2, int n3)
	{
		num1 = n1;
		num2 = n2;
		num3 = n3;
	}
	
	public boolean hasSameRightmostDigit()
	{
		int a = num1%10;
		int b = num2%10;
		int c = num3%10;
		
		return a == b || b == c || a == c;		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st non-negative Interger: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter 2nd non-negative Interger: ");
		int n2 = sc.nextInt();
		
		System.out.println("Enter 3rd non-negative Interger: ");
		int n3 = sc.nextInt();
		
		ThreeInteger ti = new ThreeInteger(n1, n2, n3);
		System.out.println("Result: " +ti.hasSameRightmostDigit());

	}

}
