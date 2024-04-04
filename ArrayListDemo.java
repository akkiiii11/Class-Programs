package com.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList list = new ArrayList();
		
		list.add(5);
		list.add('A');
		list.add("Akanksha");
		list.add("Akanksha");
		list.add(true);
		list.add(0);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add('E');
		list.add(2.3f);
		list.add(true);
		list.add(7);
		list.add('E');
		list.add(2.3f);
		
//		ArrayList<> list2 = new ArrayList<String>;
//		list2.add("One");
//		list2.add("Two");
//		list2.add("Three");
//		
//		System.out.println(list2.size());
//		
//		list2.remove("Two");
		
		
		System.out.println(list.get(4));
		

	}

}
