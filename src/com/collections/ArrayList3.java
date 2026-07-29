package com.collections;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<>();
		a1.add(20);
		a1.add(21);
		a1.add(22);
		a1.add(23);
		a1.add(24);
		System.out.println(a1);
		
//java.util.ConcurrentModificationException
//		for(int i:a1) {
//			System.out.print(i+" ");
//			a1.add(100);
//		}

	}

}
