package com.loopingstatements;

import java.util.Scanner;

public class DigitsCountInNumberWithWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int r = 0;
		int count = 0;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			count++;
		}
		System.out.println("number of digits in the given number :" + count);
		sc.close();
	}

}
