package com.collection.lab_8;

import java.util.TreeSet;

public class FindNumbersLessThan7TreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(5);
		set.add(3);
		set.add(7);
		set.add(10);
		set.add(8);
		set.add(6);
		set.add(7);
		set.add(20);
		set.add(4);
		set.add(1);
		set.add(11);
		
		System.out.println("TreeSet: " +set);
		
		System.out.println("Numbers less than 7: ");
		
		for(int num:set)
		{
			if(num < 7)
			{
				System.out.println(num);
			}
		}

	}

}
