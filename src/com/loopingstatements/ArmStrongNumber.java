package com.loopingstatements;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int temp = n;
		int r = 0;
		int sum = 0;
		String s = Integer.toString(n);
		int count = s.length();
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum = (int) (sum + Math.pow(r, count));
		}
		if (sum == temp) {
			System.out.println("The given number " + temp + " is a ArmStrong number");
		} else {
			System.out.println("The given number " + temp + " is a not ArmStrong number");

		}
		sc.close();

	}

}
