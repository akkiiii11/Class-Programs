package com.thread.lab_9;

public class BankAccountThread {
	
	private double balance;

	public void deposit(double amount)
	{
		try
		{
			balance = balance + amount;
			System.out.println("Deposit: " +amount);
			System.out.println("Balance After Deposit: " +balance);
		}
		
		catch(ArithmeticException e) {
			
		}
	}
	
	public void withdraw(double amount)
	{
		try
		{
			if(balance >= amount)
			{
				balance = balance - amount;
				System.out.println("Withdrawal: " +amount);
				System.out.println("Balance After Withdrawal: " +balance);
			}
			
			else
			{
				System.out.println("Insufficient Balance. Withdrawal Cancelled.");
			}
			
		}
		
		catch(ArithmeticException e) {
			
		}
	}


	public static void main(String[] args) {
		
		BankAccountThread account = new BankAccountThread();
		
		Thread desposit1 = new Thread(() -> account.deposit(1000));
		Thread desposit2 = new Thread(() -> account.deposit(300));

		Thread withdrawal1 = new Thread(() -> account.withdraw(150));
		Thread withdrawal2 = new Thread(() -> account.withdraw(1200));
		
		desposit1.start();
		desposit2.start();
		
		withdrawal1.start();
		withdrawal2.start();
		
	}

}
