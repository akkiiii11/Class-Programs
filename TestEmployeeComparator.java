package com.collection.sort;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployeeComparator {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(11, "Akanksha", 50000);
		Employee emp2 = new Employee(8, "Sunny", 20000);
		Employee emp3 = new Employee(1, "Nivedita", 30000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		
		System.out.println("Before Sorting: ");
		System.out.println(al);
		
//		Compare with Employee ID
		EmployeeIdComparator id = new EmployeeIdComparator();
		Collections.sort(al, id);
		System.out.println("\nAfter Sorting by Employee Id: ");
		System.out.println(al);

//		Compare with Employee Name
		EmployeeNameComparator name = new EmployeeNameComparator();
		Collections.sort(al, name);
		System.out.println("\nAfter Sorting by Employee Name: ");
		System.out.println(al);
		
//		Compare with Employee Salary
		EmployeeSalaryComparator sal = new EmployeeSalaryComparator();
		Collections.sort(al, sal);
		System.out.println("\nAfter Sorting by Employee Salary: ");
		System.out.println(al);
		
		
	}

	

}
