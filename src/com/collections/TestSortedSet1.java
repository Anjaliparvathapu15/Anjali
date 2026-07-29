package com.collections;
import java.util.SortedSet;
import java.util.TreeSet;
public class TestSortedSet1 {

	public static void main(String[] args) {
		SortedSet <Integer>s1=new TreeSet<>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(7);
		s1.add(21);
		s1.add(45);
		System.out.println(s1);
		System.out.println(s1.first());
		System.out.println(s1.last());
		System.out.println(s1.headSet(21));//21 is exclusive.
		System.out.println(s1.tailSet(2));//2 is inclusive.
		System.out.println(s1.subSet(2, 21));//fromElement is inclusive and to element is Exclusive.
		System.out.println(s1.subSet(2, 25));//it takes upto the elements that are less then the give last element
//		SortedSet s2=new TreeSet();
//		s2.add(null);
//		if we add null value to the SortedSet then it gives NullPointerException.
//		s2.add(2);
//		s2.add("anjali");
//		System.out.println(s2);
		
	}

}
