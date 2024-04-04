package com.collection;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add("Akanksha");
		set.add("Salunkhe");
		set.add("Akanksha");
		set.add('A');
		set.add('S');
		set.add(null);
		set.add(null);
		set.add(null);
		set.add('A');
		
//		set.add(set);	//this collection
		
//		set.addLast(1000);		//Error 	when Create an object then use this method
		
		set.size();	
//		set.removeAll(set);
		
//		set.notifyAll();
		
		System.out.println(set);
		
	}

}
