package com.arrays;

public class ArrayMaxOdd {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 7, 9, 10, 21, 8 };
		int maxodd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0 && arr[i] > maxodd) {
				maxodd = arr[i];
			}
		}

	}

}
