package com.inheritancedemo;

class ABC
{
	public int z;
}

class PQR
{
	void display()
	{
		ABC a1 = new ABC();
		System.out.println(a1.z);
	}
}

class MNC extends ABC
{
	void show()
	{
		ABC a1 = new ABC();
		System.out.println(a1.z);
	}
}

public class MainDemo {
	
	public int a;

	public static void main(String[] args) {
		
		
	}
}
