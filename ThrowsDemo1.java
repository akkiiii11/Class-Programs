package com.ExceptionDemo;

import java.io.IOException;

public class ThrowsDemo1 {
	
	void method1() throws IOException
	{
		throw new IOException("Some Hardware Problem");
	}
	
	void method2() throws IOException
	{
		method1();
	}
	
	void method3()
	{
		try {
			method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block+
		}
	}

	public static void main(String[] args) {
		
		ThrowsDemo1 td = new ThrowsDemo1();
		td.method3();
		System.out.println("Bacha hua code execute hoga");

	}

}
