package com.corejava.lab_2;

public class Employee {
	
	String name;
	String jobTitle;
	double salary;
	double addSalary;

	public void emp() {
		name = "Akanksha";
		jobTitle = "Software developer";
		salary = 50000; 
		addSalary = 10000;
	}

	public double updateSalary() {
		
		salary = salary + addSalary;
		return salary;
//		System.out.println("Employee Updated Salary: "+updateSalary);
	}
	
	public void display() {
		  
		System.out.println("Employee Name: " +name+ "\nEmployee Job Title: " +jobTitle+ "\nSalary: " +salary+ "\nnew Salary: " +addSalary);
		System.out.println("Employee Updated Salary: " +updateSalary());
	}
	

	public static void main(String[] args) {
		Employee emp1 = new Employee();
  
		emp1.emp();
		emp1.display();
		emp1.updateSalary();
	    
	}
}
