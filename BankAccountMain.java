package lab_5;

abstract class BankAccount
{
	protected String accountNumber;
	protected double balance;
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	abstract void deposit(double amount);
	
	abstract void withdraw(double amount);
	
	public double getBalance()
	{
		return balance;
	}
}

class SavingsAccount extends BankAccount
{

	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		
	}

	@Override
	void deposit(double amount) {
		
		balance = balance + amount;
		System.out.println("Deposit of " +amount + " into Saving Account Completed.");
		
	}

	@Override
	void withdraw(double amount) {
		
		if (amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Withdrwal of " +amount+ " into Saving Account Completed.");
		}
		
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}
	
	
}

class CurrentAccount extends BankAccount
{

	public CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		
	}

	@Override
	void deposit(double amount) {
		
		balance = balance + amount;
		System.out.println("Deposit of " +amount + "into Current Account Completed.");
		
				
	}

	@Override
	void withdraw(double amount) {
		
		if (amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Withdrwal of " +amount+ "into Current Account Completed.");
		}
		
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}
		
}

public class BankAccountMain {

	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount("SA-8711", 10000);
		sa.deposit(5000);
		System.out.println("\nAccount Number is: " +sa.accountNumber );
		System.out.println("Total Savings Account Balance is: " +sa.getBalance());
		
		System.out.println();
		
		sa.withdraw(100);
		System.out.println("Total Savings Account Balance is: " +sa.getBalance()+ "\n");
		
		CurrentAccount ca = new CurrentAccount("CA-9856", 50000);
		ca.deposit(10000);
		System.out.println("\nAccount Number is: " +ca.accountNumber );
		System.out.println("Total Savings Account Balance is: " +ca.getBalance());
		
		System.out.println();
		
		ca.withdraw(500);
		System.out.println("Total Savings Account Balance is: " +ca.getBalance());

	}

}
