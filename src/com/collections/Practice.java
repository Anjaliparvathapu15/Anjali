package com.collections;
import java.util.Collection;
import java.util.ArrayList;
public class Practice {

	public static void main(String[] args) {
//		Collection is a raw type. 
//		References to generic type Collection<E> should be parameterized
		Collection <Integer>c1=new ArrayList<>();
		System.out.println(c1);
		System.out.println(c1.add(10));
		c1.add(15);
		c1.add(200);
		Collection <Integer>c2=new ArrayList<>();
		Collection <Integer>c3=new ArrayList<>();
		c2.add(25);
		c2.add(45);
		c2.add(7);
		c1.addAll(c2);
		c3.addAll(c2);
		System.out.println(c1.addAll(c2));
		System.out.println(c1);
		//clear
		c2.clear();
		System.out.println(c2);//[]
		System.out.println(c3);
		
	}

}
