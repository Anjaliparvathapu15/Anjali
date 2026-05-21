package com.loopingstatements;

import java.util.Scanner;

public class FactorsOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		// if n is a number then we no need to check up to n for factor we only check
		// Up to n/2
		System.out.println(" ");
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
