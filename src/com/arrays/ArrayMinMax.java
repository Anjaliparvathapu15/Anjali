package com.arrays;

public class ArrayMinMax {

	public static void main(String[] args) {
		int[] num = { 12, 24, 36, 6, 7, 0, 18 };
		int min = num[0];
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}else if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("min value :" + min);
		System.out.println("max value :" + max);
	}

}
