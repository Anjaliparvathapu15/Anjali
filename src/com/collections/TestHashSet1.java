package com.collections;
import java.util.Set;
import java.util.HashSet;
public class TestHashSet1 {

	public static void main(String[] args) {
		Set<Integer>s1=new HashSet<>();
		s1.add(10);
		s1.add(11);
		s1.add(12);
		s1.add(null);//0-->index
		System.out.println(s1);
		Set s2=new HashSet();
		s2.add("Teja");
		s2.add("Vinay");
		s2.add(1);
		System.out.println(s2);
	}

}
