package com.collection;
// LinkListHierarchyMain is a LinkedList.

import java.util.LinkedList;

public class LinkListHierarchyMain extends LinkedList {

	public static void main(String[] args) {
		
		LinkListHierarchyMain myList = new LinkListHierarchyMain();
		       
		    	myList.add("apple");
		        myList.add("banana");
		        myList.add("cherry");
		        
		        myList.add(12);

		        System.out.println(myList);

		        myList.addFirst("orange");
		        myList.addLast("kiwi"); 
		        
		        System.out.println(myList);

	}

}
