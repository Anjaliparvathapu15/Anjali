package com.loopingstatements;

public class SumAndCountOfEvenAndOdd {

	static void countAndSumOfEven() {
		int count = 0;
		int sum = 0;
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				count++;
				sum = sum + i;
			}
		}
		System.out.println("Number Of Even Numbers up to 50 :" + count);
		System.out.println("Sum Of Even Number up to 50     :" + sum);
	}

	static void countAndSumOfOdd() {
		int count = 0;
		int sum = 0;
		for (int i = 0; i <= 50; i++) {
			if (i % 2 != 0) {
				count++;
				sum = sum + i;
			}
		}
		System.out.println("Number Of Odd Numbers up to 50  :" + count);
		System.out.println("Sum Of Odd Number up to 50      :" + sum);
	}

	public static void main(String[] args) {
		countAndSumOfEven();
		countAndSumOfOdd();

	}

}
