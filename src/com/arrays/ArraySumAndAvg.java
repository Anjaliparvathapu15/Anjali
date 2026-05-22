package com.arrays;

public class ArraySumAndAvg {

	public static void main(String[] args) {
		int[] marks = { 99, 98, 97, 96, 95 };
		double sum = 0;
		double avg = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		avg = sum / marks.length;
		System.out.println("sum of the numbers :" + sum);
		System.out.println("av of the numbers  :" + avg);
	}

}
