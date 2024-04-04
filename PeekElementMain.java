package com.collection;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class PeekElementMain 
{

	public static void main(String[] args) 
	{
		PriorityQueue queue=new PriorityQueue();
		
		try
		{
			queue.add(null);
		}
		catch(NullPointerException ne)
		{
			System.out.println("don't enter null value");
		}
//		queue.add(12);
		//queue.add(1);
		//queue.add(4);
		System.out.println(queue);
		
		
		
		try {
			System.out.println(queue.remove());	
		}
		catch(NoSuchElementException ne)
		{
			System.out.println("There is nothing in the object");
		}
		

		System.out.println(queue.peek());
        try
        {
        	System.out.println(queue.element());
        }
        catch(NoSuchElementException ex)
        {
        	System.out.println("There is nothing in the object2");
        }
		
	}
		
}
