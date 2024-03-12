package com.classdemo;

//stack and heap memory



class StaticBlock {
	
	static int staticVariable;
	
	static
	{
		System.out.println("Static component SIB(Static Inilization Block)");
		staticVariable = 10;
	}
	
	{
		// instance initializing block
	}
	
	static void staticMethod()
	{
		System.out.println("From Static Method");
		System.out.println(staticVariable);
	}
}

public class StaticBlockDemo {
	static
	{
		System.out.println("Main class SIB");
	}
	

	public static void main(String[] args) {
		
		StaticBlock.staticVariable = 20;
		StaticBlock.staticMethod();
		
		
	}

}
