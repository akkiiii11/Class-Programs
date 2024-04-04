package com.collection;

import java.util.LinkedHashSet;

public class LinkedSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet set = new LinkedHashSet();
		
		set.add("Akanksha");
		set.add("Salunkhe");
		set.add(55);
		set.add(60);
		set.add(50);
		set.add("Akanksha");
		set.add('J');
		set.add('h');
		set.add(01);
		
		set.add(null);
		set.add(null);
		
//		set.addLast("A");
//		set.addAll(set);
		
		set.add("Priya");
		
		
		System.out.println(set);
		
	}

}
