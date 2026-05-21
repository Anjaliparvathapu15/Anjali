package com.operators;

import java.util.Scanner;

public class EvenOrOddWithBitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		String s = ((num & 1) == 0) ? "even" : "odd";
		System.out.println("Given number is:" + s);

	}

}
