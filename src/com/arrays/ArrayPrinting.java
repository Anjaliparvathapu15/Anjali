package com.arrays;

public class ArrayPrinting {

	public static void main(String[] args) {
		// declaration of Array
		int[] num;
		// creation of Array
		num = new int[5];
		num[0] = 22;
		num[1] = 23;
		num[2] = 24;
		num[3] = 26;
		num[4] = 27;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
		}
	}

}
