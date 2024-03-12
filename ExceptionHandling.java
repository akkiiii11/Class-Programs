package com.ExceptionDemo;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Ye Statement Execute Hoga");
		
		try
		{
			Integer i = new Integer("abc"); // NumberFormatException
		}
		
		catch(NumberFormatException ns)
		{
			
		}
//		int a = "abc";
		
		System.out.println("Ye Statement Execute nahi hoga");
	}

}
