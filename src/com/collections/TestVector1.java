package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector1 {
//the methods present in Vector as Synchronized.and it is Thread-safe.
	public static void main(String[] args) {
		Vector <Integer>v1=new Vector<>();
		v1.add(101);
		v1.add(102);
		v1.add(103);
		v1.add(104);
		v1.add(105);
		System.out.println(v1);
		Enumeration<Integer>en=v1.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

	}

}
