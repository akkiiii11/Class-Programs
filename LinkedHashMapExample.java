package com.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lm = new LinkedHashMap<Integer, String>();
		
		lm.put(1, "Akanksha");
		lm.put(11, "Sunny");
		lm.put(8, "Akanksha");
		lm.put(6, "Seeta");
		lm.put(5, null);
		lm.put(null, null);
		lm.put(null, null);
		lm.put(null, "AS");
		
		System.out.println(lm);
	}

}
