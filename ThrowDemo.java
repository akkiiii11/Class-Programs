package com.ExceptionDemo;


public class ThrowDemo {

	void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("Age is not valid");
		
		else
			System.out.println("Ur are eligible for voting");
	}
	
	public static void main(String[] args) {
		
		ThrowDemo td = new ThrowDemo();
		
		try
		{
			td.validate(13);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Welcome for Voting");
		}

	}

}
