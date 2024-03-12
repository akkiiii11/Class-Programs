package com.javacore.class_program;

import java.util.Scanner;

public class programDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabet");
		String input = sc.next().toLowerCase();
		
		boolean upperCase = input.charAt(0) >=65 && input.charAt(0) <=90;
		boolean lowerCase = input.charAt(0) >=97 && input.charAt(0) <=122;
		
		boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
		
		if(input.length() > 1)
		{
			System.out.println("Error not a single character");
		}
		else if(!(upperCase || lowerCase))
		{
			System.out.println("Error not a letter Enter Uppercase or Lowercase");
		}
		else if(vowels)
		{
			System.out.println("Input letter is vowel");
		}
		else
		{
			System.out.println("Input is not a vowel");
		}
 
	}

}
