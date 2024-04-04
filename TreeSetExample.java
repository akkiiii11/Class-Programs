package com.collection;


import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
//		set.add(1);
		set.add('A');
		set.add('Z');
//		set.add(100);			//Error
//		set.add(11);			//Error
//		set.add(8);				//Error
//		set.add("Sunny");		//Error
//		set.add("Akanksha");	//Error
//		set.add(100);			//Error
//		set.add(null);			//Error
		set.add('A');
//		set.add("Sunny");		//Error
//		set.add(null);			//Error
		
//		set.addAll(set);
//		set.addLast('K');		//Error
		
		System.out.println(set);

	}

}
