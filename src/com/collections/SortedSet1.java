package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {

	public static void main(String[] args) {
		SortedSet<Integer>s1=new TreeSet<>();
		//Sorted Order of the elements
		s1.add(101);
		s1.add(102);
		s1.add(103);
		s1.add(104);
		s1.add(12);
		System.out.println(s1);
		
		System.out.println(s1.last());
		System.out.println(s1.first());
		System.out.println(s1.headSet(101));//less than the given element 
		System.out.println(s1.tailSet(101));//greater than or equal to the given element
		System.out.println(s1.subSet(101, 111));//from element is inclusive to element is exclusive.
	}

}
