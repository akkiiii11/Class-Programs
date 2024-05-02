package lab_4;

class Employee
{
	String name;
	double salary;
	
	Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public double calculateSalary()
	{
		return salary;
	}
}

class Manager extends Employee
{
	double bonus;

	Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	
	public double calculateSalary()
	{
		return salary + bonus;
	}
	
}

class Programmer extends Employee
{
	double overtime;

	Programmer(String name, double salary, double overtime) {
		super(name, salary);
		this.overtime = overtime;
	}
	
	public double calculateSalary()
	{
		return salary + overtime;
	}
	
}

public class EmployeeMain {

	public static void main(String[] args) {
		
		Manager em = new Manager("Akanksha",50000,10000);
		System.out.println("Manager details are: ");
		System.out.println("Name: " +em.name+ ",Salary: " +em.salary+ ",Bonus: " +em.bonus+ ",Total Salary: " +em.calculateSalary());

		System.out.println();
		
		Programmer ep = new Programmer("Sunny",60000,15000);
		System.out.println("Programmer details are: ");
		System.out.println("Name: " +ep.name+ ",Salary: " +ep.salary+ ",Bonus: " +ep.overtime+ ",Total Salary: " +ep.calculateSalary());
		
	}

}
