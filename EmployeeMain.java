package lab_5;

abstract class Employee
{
	protected String name;
	protected double baseSalary;
	
	public Employee(String name, double baseSalary) {
	
		this.name = name;
		this.baseSalary = baseSalary;
	}

	abstract double calculateSalary();
	
	abstract void displayInfo();
}

class Manager extends Employee
{

	private double bonus;

	public Manager(String name, double baseSalary, double bonus) {
		super(name, baseSalary);
		this.bonus = bonus;
	}

	@Override
	double calculateSalary() {
		
		return baseSalary + bonus;
				
	}

	@Override
	void displayInfo() {
		
		System.out.println("Emplyee Name : Manager : " +name);
		System.out.println("Manager Base Salary : " +baseSalary);
		System.out.println("Manager Bonus : " +bonus);
		
	}
	
}

class Programmer extends Employee
{
	private double overtimeSalary;

	public Programmer(String name, double baseSalary, double overtimeSalary) {
		super(name, baseSalary);
		this.overtimeSalary = overtimeSalary;
	}

	@Override
	double calculateSalary() {
		
		return baseSalary + overtimeSalary;
		
	}

	@Override
	void displayInfo() {
		
		System.out.println("Employee Name : Programmer : " +name);
		System.out.println("Programmer Base Salary : " +baseSalary);
		System.out.println("Programmer Overtime Salary : " +overtimeSalary);
			
	}
	
}

public class EmployeeMain {

	public static void main(String[] args) {
		
		Manager em = new Manager("Akanksha",40000,10000);
		em.calculateSalary();
		em.displayInfo();
		
		System.out.println("Manager Total Salary : " +em.calculateSalary());
		System.out.println();
		
		Programmer ep = new Programmer("Sunny",50000,20000);
		ep.calculateSalary();
		ep.displayInfo();
		
		System.out.println("Manager Total Salary : " +ep.calculateSalary());

	}

}
