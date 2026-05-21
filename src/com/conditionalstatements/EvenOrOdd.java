package com.conditionalstatements;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("the number " + n + " is Even");
		} else {
			System.out.println("the number " + n + " is Odd");
		}
		sc.close();

	}

}
