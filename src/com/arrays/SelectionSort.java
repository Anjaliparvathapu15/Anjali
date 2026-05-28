package com.arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 45, 89, 23, 4, 66, 1, 3, 45 };
		int temp = 0;
		System.out.println("Array Beftore Sorting :");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println();
		System.out.println("Sorted Array :");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
