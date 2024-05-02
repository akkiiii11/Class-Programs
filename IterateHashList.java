package com.collection.lab_8;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashList {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("Python");
		set.add("C-programming");
		set.add("C++");
		set.add("HTML");
		
		System.out.println("HashSet: " +set);
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			String element = iterator.next();
			System.out.println(element);
		}

	}

}
