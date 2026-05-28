package com.arrays;

public class MaxDifference {

	public static void main(String args[]) {

		int arr[] = { 2, 1, 11, 8, 10 };
		int min = arr[0];
		int maxDiff = arr[1] - arr[0];
		for (int i = 0; i < arr.length; i++) {
			int diff = arr[i] - min;
			if (diff > maxDiff) {
				maxDiff = diff;
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maximun Difference is :" + maxDiff);

	}
}
