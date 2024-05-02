package com.corejava.lab_1;

import java.util.Scanner;

public class sum_average {

	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        
	        int sum = 0;
	        
	        for (int i = 1; i <= 5; i++) {
	        	
	            System.out.print("Enter number " + i + ": ");
	            
	            int num = scanner.nextInt();
	            
	            sum = sum+num;
	        }
	        
	        int average = sum / 5;
	        
	        System.out.println("The sum of the 5 numbers is: " + sum);
	        
	        System.out.println("The average of the 5 numbers is: " + average);
	    
	    }
}
