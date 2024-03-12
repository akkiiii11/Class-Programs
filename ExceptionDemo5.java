package com.ExceptionDemo;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		 int result, a = 10, b = 2;
		 
		 try
		 {
			 result = a/b;
			 System.out.println(result);
		 }		 
		 
		 catch(ArithmeticException e)
		 {
			 System.out.println("Division by 0 is not Possible");
		 }
		 
		 finally
		 {
			 System.out.println("Close all the connections");
		 }
		 
		 System.out.println("Bacha Hua code execute hoga");
		
	}

}
