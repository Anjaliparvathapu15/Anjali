package com.collections;
import java.util.NavigableSet;
import java.util.TreeSet;
public class TestNavigableSet {

	public static void main(String[] args) {
		NavigableSet <Integer>s1=new TreeSet<>();
		s1.add(12);
		s1.add(22);
		s1.add(23);
		s1.add(99);
		System.out.println(s1);
		System.out.println(s1.floor(23));//the element which is greatest element that is less than or equal to the given element
		System.out.println(s1.ceiling(25));//the element which is least element that is greater than or equals to the given element
		System.out.println(s1.lower(23));//the element which is less than the element
		System.out.println(s1.higher(23));// the element which is greater than the given element.
		
	}

}
