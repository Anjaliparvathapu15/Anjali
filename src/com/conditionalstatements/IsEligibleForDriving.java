package com.conditionalstatements;

import java.util.Scanner;

public class IsEligibleForDriving {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("Do you have license :");
			boolean hasLincense = sc.nextBoolean();
			if (hasLincense) {
				System.out.println("Your are Eligible for Driving");
			} else {
				System.out.println("Your age Ok but you must need Lincense for driving");
			}
		} else {
			System.out.println("your age is not satisfing the conditions");
		}
		sc.close();

	}

}
