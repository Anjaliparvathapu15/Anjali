package com.loopingstatements;

import java.util.Scanner;
// Program to find Given number is Prime not not by using boolean statements
public class IsPrimeNumberOrNot2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		if (n <= 1) {
			System.out.println("Given number" + n + " is not a prime");
		} else {
			boolean isprime = true;
			for (int i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				System.out.println("Given number " + n + " is  a prime");
			} else {
				System.out.println("Given number" + n + " is not a prime");
			}
		}
		sc.close();

	}

}
