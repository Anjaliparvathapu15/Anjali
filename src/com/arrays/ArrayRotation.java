package com.arrays;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many time to rotate :");
		int r = sc.nextInt();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Array beftore rotation :");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Array After Rotation :");
		arrayRotation(arr, r);
		for (int a : arr) {
			System.out.print(a + " ");
		}
		sc.close();
	}

	static void arrayRotation(int[] arr, int r) {
		int start = 0;
		int end = arr.length - 1;
		// Reverse Total Array
		arrayRev(arr, start, end);
		// Reverse half of the array
		arrayRev(arr, start, r - 1);
		// Reverse second half of the array
		arrayRev(arr, r, end);
	}

	static void arrayRev(int[] arr, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
