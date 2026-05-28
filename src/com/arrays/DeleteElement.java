package com.arrays;

public class DeleteElement {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int position = 2;
		int[] arr1 = new int[arr.length - 1];
		for (int i = 0; i < position; i++) {
			arr1[i] = arr[i];
		}
		for (int i = position + 1; i < arr.length; i++) {
			arr1[i - 1] = arr[i];
		}
		for (int a : arr1) {
			System.out.print(a + " ");
		}
	}

}
