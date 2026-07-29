package com.collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratingElemnts {

	public static void main(String[] args) {
		Collection <String>c1=new ArrayList<>();
		c1.add("Anjali");
		c1.add("Raghu");
		c1.add("KotaChary");
		c1.add("Nagamani");
		c1.add("Teja");
		c1.add("Vinay");
		for(String a:c1) {
			System.out.println(a);	
		}
		System.out.println("***************************************************");
		Iterator <String> itr=c1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("****************************************************");

	}

}
