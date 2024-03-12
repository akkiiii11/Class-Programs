package com.classdemo;

public class ConstructDemo {
	
	public ConstructDemo()
	{
		System.out.println("Constructor start hua");
	}

	public void show()
	{
		System.out.println("Normal Method");
	}
	
	public static void main(String[] args) {
		
		ConstructDemo cs = new ConstructDemo();
//		cs.ConstructDemo();
		cs.show();
	}

}
