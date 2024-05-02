package com.collection.lab_8;

import java.util.LinkedList;

public class FirstLastOccurrenceLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Akanksha");
		list.add("Sunny");
		list.add("Nivedita");
		list.add("Shriyank");
		list.add("Ajay");
		list.add("Siya");
		list.add("Vijay");
		list.add("Mahesh");
		
		System.out.println("LinedList: " +list);
		
		System.out.println("First Occurrence of 4: " +list.indexOf(4));
		System.out.println("Last Occurrence of 4: " +list.lastIndexOf(4));
	}

}
