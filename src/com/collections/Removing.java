package com.collections;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.Iterator;

public class Removing {

	public static void main(String[] args) {
		Collection <Integer> c1= new ArrayList<>();
		c1.add(1);
		c1.add(7);
		c1.add(18);
		c1.add(45);
		c1.add(9);
		c1.add(21);
//		Iterator <Integer> itr=c1.iterator();
//		while(itr.hasNext()) {
//			int i=itr.next();
//			if(i==21) {
//				itr.remove();
//			}
//		}
		System.out.println(c1);
		System.out.println("*****************************");
		for(int a: c1) {
			//after 9 we have only one element so no exception is thrown.
			if(a==9) {
				c1.remove(a);
			}
		}
		System.out.println(c1);
	}

}
