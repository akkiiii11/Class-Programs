package com.corejava.class_practice_program;

import java.util.Scanner;

public class ASCIIValue {
	
	char character;
	
	ASCIIValue(char c)
	{
		character = c;
	}
	
	public int getASCIIValue()
	{
		return character;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Character: ");
		char c = sc.next().charAt(0);
		
		ASCIIValue a = new ASCIIValue(c);
		
		int asciiValue = a.getASCIIValue();
		
		System.out.println("ASCII Value of " + a.character + ":" + asciiValue);
		
	}

}
