package com.loopingstatements;

import java.util.Scanner;

public class EvenOddSumInARange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range Start and End");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println("Even Number Sum in the Given Range :" + evenSum);
		System.out.println("Odd Number Sum in the Given Range" + oddSum);
		sc.close();
	}

}
