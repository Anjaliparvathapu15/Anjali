package com.arrays;

public class SortingArrayAsc {

	public static void main(String[] args) {
		int[] arr = { 11, 33, 44, 5, 6, 8, 9 };
		int temp = 0;
		int count=0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count++;
				}
			}

		}
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println(count);

	}

}
