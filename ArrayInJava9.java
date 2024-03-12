package com.classdemo;

//passing Array of Derived Type as a parameter to the Method
class AB
{
	int i;
}

public class ArrayInJava9 {
	
	static void methodOne(AB[] a)
	{
		a[2].i = 25;
		a[5].i = 45;
	}

	public static void main(String[] args) {
		
		AB[] a = new AB[8];
		a[2] = new AB();	//creating A-type object and assigning it to element at index 2
		a[5] = new AB();
		
		a[2].i = 10;
		a[5].i = 20;
		
		methodOne(a); //calling method
		
		System.out.println(a[2].i);
		System.out.println(a[5].i);

	}

}
