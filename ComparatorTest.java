package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Comparable and Comparator both are interfaces and can be used to sort collection elements.
// there are many differences between Comparable and Comparator interfaces.
// Comparable provides a single sorting sequence. In other words, we can sort the collection on the basis of a single element such as id, name, and price.
// The Comparator provides multiple sorting sequences. In other words, we can sort the collection on the basis of multiple elements such as id, name, and price etc.
// Comparable provides compareTo() method to sort elements.
// Comparator provides compare() method to sort elements.
// Comparable is present in java.lang package.
// A Comparator is present in the java.util package. 

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	int age;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Employee o) {
		if(age == o.age)
		{
			return 0;
		}
		
		else if(age > o.age)
		{
			return 1;
		}
		
		else
		{
			return -1;
		}
	}
	
	
}

public class ComparatorTest{
	
	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		
		Employee emp1 = new Employee(1, "Akanksha", 23);
		Employee emp2 = new Employee(2, "Sunny", 20);
		Employee emp3 = new Employee(3, "Shravani", 18);
		Employee emp4 = new Employee(4, "Shriyank", 29);

		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		
		Collections.sort(al);
		
		for(Employee e: al)
		{
			System.out.println("Employeee Id: " +e.id+ "\n Employee Name: " +e.name+ "\n Employee Age: " +e.age);
		}
		
	}

}
