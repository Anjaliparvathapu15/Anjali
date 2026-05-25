package com.arrays;

public class CountOfEvenAndOdd {

	public static void main(String[] args) {
		int[] num = { 11, 24, 26, 35, 33, 67, 66, 89, 92 };
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Number of Even numbers:" + evenCount);
		System.out.println("Number of Odd numbers:" + oddCount);

	}

}
