package com.gutquestions;
import java.util.Set;
import java.util.HashSet;
public class SubsetUsingHashSet {

	public static void main(String[] args) {
		int []a= {1,2,3,4};
		int[]b= {2,3};
		Set<Integer>set=new HashSet<>();
		for(int num:a) {
			set.add(num);
		}
		boolean status=true;
		for(int num:b) {
			if(!set.contains(num)) {
				status=false;
				break;
			}
		}
		if(status) {
			System.out.println("Subset");
		}else {
			System.out.println("Not a subset");
		}

	}

}
