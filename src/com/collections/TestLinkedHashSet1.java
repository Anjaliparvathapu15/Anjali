package com.collections;
import java.util.Set;
import java.util.LinkedHashSet;
public class TestLinkedHashSet1 {

	public static void main(String[] args) {
		Set <Integer>s1=new LinkedHashSet<>();//Insertion order preserved.
		s1.add(11);
		s1.add(23);
		s1.add(33);
		s1.add(88);
		s1.add(45);
		s1.add(7);
		System.out.println(s1);
	}

}
