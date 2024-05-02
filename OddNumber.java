package com.lab_6;

public class OddNumber {
	
	void checkNumber(int n)
	{
		if(n%2==0)
		{
			throw new ArithmeticException(n+ " is not Odd Number.");
		}
		else
		{
			System.out.println(n+ " is a Odd Number.");
		}
	}

	public static void main(String[] args) {

		OddNumber on = new OddNumber();
		
		try
		{
			on.checkNumber(50);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Number is checked.");
		}

	}

}
