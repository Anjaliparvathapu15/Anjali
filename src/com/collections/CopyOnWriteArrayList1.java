package com.collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList1 {

	public static void main(String[] args) {
		// works on a copy of a list not on original list.
		//if we add the elements they are added at the end of the original list.
		CopyOnWriteArrayList<Integer>c1=new CopyOnWriteArrayList<>();
		c1.add(101);
		c1.add(102);
		c1.add(103);
		c1.add(104);
		System.out.println(c1);
		for(int a:c1) {
			System.out.println(a);
			c1.add(22);
		}
		System.out.println(c1);

	}

}
