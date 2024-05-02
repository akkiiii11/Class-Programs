package com.collection.lab_8;

import java.util.HashMap;
import java.util.Map;

public class CountKeyMapping {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Java", 3);
		map.put("Python", 5);
		map.put("C++", 2);
		map.put("HTML", 4);
		map.put("PHP", 9);
		map.put("JavaScript", 7);
		map.put("NodeJs", 6);
		
		System.out.println("HashMap: " +map);
		
		System.out.println("Size of HashMap: " +map.size());

	}

}
