package com.loopingstatements;

import java.util.Scanner;

public class IsPrimeNumberOrNot1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		if (n <= 1) {
			System.out.println("given number " + n + " is not a prime");
		} else {
			for (int i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					System.out.println("not aprime");
					return;
				}
			}
			System.out.println("prime");
		}
		sc.close();
	}

}
