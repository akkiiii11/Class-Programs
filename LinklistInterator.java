package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinklistInterator {

	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		
		list.add("My name is Akanksha");
		list.add("My surname is Salunkhe");
		list.add("I am from Satara.");
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
