package com.collection;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(1, "Akanksha");
		tm.put(2, "Sunny");
		tm.put(1, "Priyanka");
		tm.put(11, "Akanksha");
		tm.put(5, null);
//		tm.put(null, "AS");				//Error
//		tm.put(null, null);				//Error
		
		System.out.println(tm);
	}

}
