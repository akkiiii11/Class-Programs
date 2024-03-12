package com.classdemo;

class Student // single unit
{  //wrapping of the data into a single unit is called as encapsulation in java.
//	private int id;
//	private String name;
//	private String address;
//	private String email;
	
	int id;
	String name;
	String address;
	String email;
	
	void display()
	{
		System.out.println(id + " " + name + " " + address + " " + email);
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {

		Student st1 = new Student();
		st1.id = 1;
		st1.name = "Akanksha";
		st1.address = "Satara";
		st1.email = "akanksha@gmail.com";
		
		st1.display();

	}

}
