package com.corejava.lab_2;

public class Person {

public void display(String name, int age) {
		
		System.out.println("Name: " +name+ ", Age: " +age);
	}

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.display("Akanksha", 22);
		p2.display("Nivedita", 23);
		
		

	}

}
