package com.arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] arr = { 1111, 3, 4, 55, 7, 99, 90, 81, 55 };
		int smallest = arr[0];
		int secondSmall = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondSmall = smallest;
				smallest = arr[i];
			} else if (arr[i] < secondSmall && secondSmall != smallest) {
				secondSmall = arr[i];
			}
		}
		System.out.println("First Smallest Number :" + smallest);
		System.out.println("Second Smallest Number :" + secondSmall);
	}

}
