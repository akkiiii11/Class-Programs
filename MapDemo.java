package com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add("Akanksha");
		
		HashMap<Integer, String> m = new HashMap();
		m.put(2, "Akanksha");
		m.put(8, "Sunny");
		m.put(11, "Pooja");
		m.put(1, "Nivedita");
		m.isEmpty();
		m.remove("Akanksha");
		m.get(10);
		m.containsKey(22);
		m.size();
		m.values();
		
		System.out.println(m);
		
//		Map m = new LinkedHashMap();
//		Map m = new TreeMap();
		

	}

}
