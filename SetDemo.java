package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set set=new LinkedHashSet();
		
		set.add(23);
		set.add(34);
		set.add(7);
		set.add(9);
		set.add(155);
		set.add('A');
		set.add("Padmaja");
		set.add(23);
		set.add(3.4);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(0);
		set.add(true);
		
	//	System.out.println(set);
		//set.get(5);
		//System.out.println(set.size());
		//System.out.println(set.isEmpty());
		//System.out.println(set.contains(23));
		
		//System.out.println(set.remove(23));
		//System.out.println(set.removeAll(set));
		
		Set set1=new LinkedHashSet();
		set1.add("Mili");
		set1.add("Tushar");
		set1.add("Vedika");
		
		System.out.println(set.addAll(set1));
		System.out.println(set);
	
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Mili");
		lhs.add("Tushar");
		lhs.add("Vedika");
//		lhs.add(12);
		
		
		
	}

}

