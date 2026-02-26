package com.langfundamental;

import java.util.Scanner;

public class Practice1 {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		System.out.println("Enter a value:");
		int b = sc.nextInt();
		System.out.println("Enter s value: ");
		int s = sc.nextInt();
		int sum = printSum(a, b);
		System.out.println("sum is:" + sum);
		System.out.println("square of " + s + ':' + printSquare(s));
		sc.close();

	}

	int printSum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	int printSquare(int s) {
		int square = s * s;
		return square;
	}

}
