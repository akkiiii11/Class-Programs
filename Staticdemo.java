package com.classdemo;

public class Staticdemo
{
	//static int a=0; =>123
	int a=0;// =>111
	public void display()
	{
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		Staticdemo sd = new Staticdemo();
		sd.display();
		Staticdemo sd1 = new Staticdemo();
		sd1.display();
		Staticdemo sd3 = new Staticdemo();
		sd3.display();
		
		
	}

}
