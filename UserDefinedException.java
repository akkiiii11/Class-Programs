package com.ExceptionDemo;

class MeraException extends Exception
{
	private int ex;     //wrapping a data

	public MeraException(int ex) {
		super();
		this.ex = ex;
	}

	@Override
	public String toString() {
		return "MeraException [ex=" + ex + "]";
	}
	
	
}

public class UserDefinedException {
	
	void sum(int a, int b) throws MeraException
	{
		if(a<0)
		{
			throw new MeraException(a);
		}
		
		else
		{
			System.out.println("The addition is: " +(a+b));
		}
	}

	public static void main(String[] args) {
		
		UserDefinedException ud = new UserDefinedException();
		try {
			ud.sum(-10, 10);
		} catch (MeraException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
