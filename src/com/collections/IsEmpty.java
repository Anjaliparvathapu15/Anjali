package com.collections;
import java.util.Collection;
import java.util.ArrayList;
public class IsEmpty {

	public static void main(String[] args) {
		Collection <String>c1=new ArrayList<>();
		c1.add("Anjali");
		Collection <String>c2=new ArrayList<>();
		c2.add("anjali");
		System.out.println(c1.equals(c2));
		if(c2.isEmpty()) {
			System.out.println("C2 is empty we can addd elements");
		}else {
			c2.addAll(c1);
			System.out.println(c2);
		}
		
	}

}
