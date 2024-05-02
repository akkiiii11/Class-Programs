package lab_5.Interface;

public class BankAccountMainInterface {

	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount("SA-8711", 20000, 3);
		sa.deposit(10000);
		System.out.println("\nAccount Number is: " +sa.accountNumber );
		System.out.println("Total Savings Account Balance is: " +sa.viewBalance());
		
		System.out.println();
		
		sa.withdraw(100);
		System.out.println("Total Savings Account Balance is: " +sa.viewBalance()+ "\n");
		
		CurrentAccount ca = new CurrentAccount("CA-9856", 30000, 5);
		ca.deposit(5000);
		System.out.println("\nAccount Number is: " +ca.accountNumber );
		System.out.println("Total Savings Account Balance is: " +ca.viewBalance());
		
		System.out.println();
		
		ca.withdraw(500);
		System.out.println("Total Savings Account Balance is: " +ca.viewBalance());

	}

}
