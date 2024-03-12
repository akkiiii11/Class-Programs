package com.corejava.class_practice_program;

import java.util.Scanner;

public class BinaryNumber {
	
	String binary1;
	String binary2;
    
    public BinaryNumber(String b1, String b2) {
        binary1 = b1;
        binary2 = b2;
    }
    
    public String addBinaryNumbers() {
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Binary 1: ");
		String b1 = sc.next();
		
		System.out.println("Enter a Binary 2: ");
		String b2 = sc.next();
		
		BinaryNumber calculator = new BinaryNumber(b1, b2);
        
        System.out.println("Sum in binary: \n" + calculator.addBinaryNumbers());

	}

}
