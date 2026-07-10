package com.arrays;

public class LeaderElement {

	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
//		for (int i = 0; i < arr.length; i++) {
//			boolean leader = true;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] < arr[j]) {
//					leader = false;
//					break;
//				}
//
//			}
//			if (leader) {
//				System.out.println(arr[i]);
//			}
//		}
		for (int i = arr.length-1; i >=0; i--) {
			boolean leader = true;
			for (int j = i ; j <arr.length; j++) {
				if (arr[i] < arr[j]) {
					leader = false;
					break;
				}

			}
			if (leader) {
				System.out.println(arr[i]);
			}

	}

	}
}
