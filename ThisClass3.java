package com.javacore.package1;

public class ThisClass3 {
	
	void display()
	{
//		this.a; // invoking current class instance variable
//		this();	//invoking current class constructor
		this.show(); 	 //invoking current class method
		System.out.println("Inside the display method");
	}
	
	void show()
	{
		System.out.println("Inside the show method");
	}

	public static void main(String[] args) {
		
		ThisClass3 ts3 = new ThisClass3();
		ts3.display();
		

	}

}
