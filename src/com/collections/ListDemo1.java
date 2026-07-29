package com.collections;
import java.util.ArrayList;
import java.util.List;
public class ListDemo1 {

	public static void main(String[] args) {
		List<Integer>li=new ArrayList<>();
		li.add(21);
		li.add(1,2000);
		li.add(24);
		li.add(27);
		li.add(2,22);
		li.set(0,800);
		System.out.println(li.get(0));
		List<Integer>l1=new ArrayList<>();
		l1.add(2);
		l1.add(null);
		l1.add(88);
		li.addAll(2,l1);
		System.out.println(li);
		List<String>s1=new ArrayList<>();
		s1.add(null);
		s1.add("T");
		s1.add("E");
		s1.add("J");
		s1.add("A");
		s1.add("J");
		s1.add("J");
		s1.remove(3);
		s1.remove("J");
		
		System.out.println(s1);
		List<Integer>i1=new ArrayList<>();
		i1.add(21);
		i1.add(1,2000);
		i1.add(24);
		i1.add(27);
		i1.add(2,22);
		i1.add(1);
		i1.set(0,800);
		i1.add(9);
		i1.add(9);
		i1.add(9);
		i1.add(9);
		i1.add(9);
		i1.add(900);
		i1.add(9000);
		i1.add(9);
		i1.add(9);
		i1.add(9);
		i1.add(9);
		i1.add(99);
		i1.add(900);
		i1.add(944);
		i1.add(944);
		i1.add(944);
		i1.add(900);
		i1.add(911);
		System.out.println(i1.indexOf(944));
		System.out.println(i1.indexOf(3));//if element is not present in list then returns -1
		i1.remove(i1.indexOf(944));
		System.out.println(i1.lastIndexOf(944));
		System.out.println(i1);//800 2000 22 24 27  
		
		
	}

}
