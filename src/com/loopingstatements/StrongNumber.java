package com.loopingstatements;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			int fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact *= i;
			}
			sum += fact;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("The given number " + temp + " is a Strong Number");
		} else {
			System.out.println("The given number " + temp + " is  not a Strong Number");
		}
		sc.close();

	}

}
