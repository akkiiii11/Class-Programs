package com.thread.lab_9;

class EvenThread implements Runnable
{

	@Override
	public void run() 
	{
		for(int i =1; i<=20; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println("Even: " +i);
			}
		}
	}

}

class OddThread implements Runnable
{

	@Override
	public void run() 
	{
		for(int i =1; i<=20; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println("Odd: " +i);
			}	
		}
	}
	
}

public class EvenOddThreads {

	public static void main(String[] args) {
		
		EvenThread even1 = new EvenThread();
		Thread t1 = new Thread(even1);
		t1.start();
		
		OddThread odd1 = new OddThread();
		Thread t2 = new Thread(odd1);
		t2.start();

	}

}
