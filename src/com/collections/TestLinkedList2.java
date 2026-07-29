package com.collections;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList2 {

	public static void main(String[] args) {
		List<Integer>l1=new LinkedList<>();
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		System.out.println(l1);
		l1.addFirst(100);//return type is void
		System.out.println(l1);
		l1.addLast(2000);
		System.out.println(l1);
		l1.removeFirst();//return type is object
		System.out.println(l1);
		l1.removeLast();//object is the return type
		System.out.println(l1);
		System.out.println(l1.getFirst());//Object is the return type
		System.out.println(l1.getLast());

	}

}
