package com.lab_6;

public class VotingApplication {
	
	void Validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("Age is not valid");
		
		else
			System.out.println("Ur are eligible for voting");
	}

	public static void main(String[] args) {
		
		VotingApplication VP = new VotingApplication();
		
		try
		{
			VP.Validate(20);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Welcome for Voting");
		}

	}

}
