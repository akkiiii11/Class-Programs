package com.ExceptionDemo;

public class ExceptionDemo5_1 {

	public static void main(String[] args) {
		 int result, a = 10, b = 0;
		 
		 try
		 {
			 result = a/b;
			 System.out.println(result);
		 }		 
		 
		 catch(NullPointerException e)
		 {
			 System.out.println("no values in variable");
		 }
		 
		 catch(ArithmeticException e)
		 {
			 System.out.println("Division by 0 is not Possible");
		 }
		 
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("not in range");
		 }
		 
		 catch(StringIndexOutOfBoundsException e)
		 {
			 System.out.println("String in not range");
		 }
		 
		 
		 finally
		 {
			 
			 System.out.println("Close all the connections");
		 }
		 
		 System.out.println("Bacha Hua code execute hoga");
		
	}

}
