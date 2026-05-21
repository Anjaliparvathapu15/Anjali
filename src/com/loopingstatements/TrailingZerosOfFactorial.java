package com.loopingstatements;

import java.util.Scanner;
//Trailing zeros are the zeros at the of a number
//here we are finding number of zeros at the of a factorial of a number
public class TrailingZerosOfFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 5; i <= n; i = i * 5) {
			count = count + (n / i);
		}
		System.out.println(count);
		sc.close();
	}

}
