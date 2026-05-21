package com.loopingstatements;

import java.util.Scanner;

//Program to find Given number is Prime not not by using count variable

public class IsPrimeNumberOrNot3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		if (n <= 1) {
			System.out.println("the number " + n + " is not a prime");
		} else {
			int count = 0;
			for (int i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println("The number " + n + " is a Prime");
			} else {
				System.out.println("The number " + n + " is not a Prime");
			}
		}
		sc.close();

	}

}
