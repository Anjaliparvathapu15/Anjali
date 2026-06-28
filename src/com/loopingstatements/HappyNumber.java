package com.loopingstatements;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		while (n !=1 &&n!=4) {
			int sum = 0;
			while (n > 0) {
				int r = n % 10;
				n = n / 10;
				int square = r * r;
				sum += square;
			}
			n = sum;
		}
		if (n == 1) {
			System.out.println("The given number " + n + " is a Happy number");
		} else {
			System.out.println("Not a happy number");
		}
		sc.close();
	}

}
