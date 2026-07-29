package com.collections;
import java.util.Collection;
import java.util.ArrayList;
public class HashCode {

	public static void main(String[] args) {
		Collection <Integer>c1=new ArrayList<>();
		System.out.println(c1.hashCode());
		c1.add(10);
		System.out.println(c1.hashCode());
		c1.add(20);
		System.out.println(c1.hashCode());

	}

}
