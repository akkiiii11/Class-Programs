package com.collection.lab_8;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Akanksha");
		list.add("Sunny");
		list.add("Nivedita");
		list.add("Shriyank");
		
		System.out.println("Before Sorting: " +list);
		
		Collections.sort(list);
		
		System.out.println("After Sorting: " +list);

	}

}
