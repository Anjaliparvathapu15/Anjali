package com.arrays;

import java.util.HashSet;

public class CommonElemnts {
	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 4, 5, 6, 2, 3, 4, 5 };
		int[] arr2 = { 2, 3, 4, 5, 6, 8, 9 };
		HashSet<Integer> set = new HashSet<>();
		for (int x : arr1) {
			set.add(x);
		}
		for (int a : arr2) {
			if (set.contains(a)) {
				System.out.print(a + " ");
				set.remove(a);
			}
		}

	}

}
