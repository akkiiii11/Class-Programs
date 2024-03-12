package com.inheritancedemo;

public class BankAccount {
	
	public String accountNumber;
	public double balance;
	
	public BankAccount(String accountNumber, double balance)
	{
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount)	//this condition for bank account
	{
//		balance = balance + amount;
		balance += amount;
	}
	
	public void withdraw(double amount)
	{
		if(balance >= amount)
		{
//			balance = balance - amount;
			balance -= amount;
		}
		
		else
		{
			System.out.println("Insufficient Amount");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
}
