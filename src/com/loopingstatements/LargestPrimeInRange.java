package com.loopingstatements;

import java.util.Scanner;

public class LargestPrimeInRange {
	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range :");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int largest = 0;
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				if (largest < i) {
					largest = i;
				}
			}
		}
		System.out.println("Largest number is  : " + largest);
		sc.close();
	}

}
