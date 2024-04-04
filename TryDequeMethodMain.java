package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.*;


public class TryDequeMethodMain
{

	public static void main(String[] args) 
	{
		Deque dq = new ArrayDeque();
		
		try
		{
			dq.add(55);
			dq.add(10.5);
			dq.add("Akanksha");
			dq.add(63);
			dq.add(11);
//			dq.add(null);
			
			dq.addFirst(100);
			dq.addLast(01);
		
		} 
		
		catch (NullPointerException  e)
		{
			System.out.println("Null Value");
		}
		
		System.out.println(dq);
	}

}
