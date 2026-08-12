package com.collections;

import java.util.ArrayList;
import java.util.Collection;


public class AddElements {

	public static void main(String[] args) {
		Collection <String> c1=new ArrayList<>();
		c1.add("Anjali");
		c1.add("Raghu");
		Collection <String> c2=new ArrayList<>();
		c2.addAll(c1);
		c2.add("Kotachary");
		c2.add("Nagamani");
		c1.clear();
		Collection <String> c3=new ArrayList<>();
		c3.addAll(c2);
		c3.add("Family");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
//		System.out.println(c3.remove("Anjali"));
//		System.out.println(c2.equals(c3));
//		System.out.println(c1.hashCode());
//		System.out.println(c2.hashCode());
//		System.out.println(c3.hashCode());

	}

}
