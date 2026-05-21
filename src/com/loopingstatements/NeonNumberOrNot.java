package com.loopingstatements;

import java.util.Scanner;

public class NeonNumberOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int n1 = n*n;
		int r = 0;
		int sum = 0;
		while (n1 != 0) {
			r = n1 % 10;// 81%10-->1
			n1 = n1 / 10;
			sum = sum + r;
		}
		System.out.println("sum of squre of given number "+n+" is "+sum);
		if (n == sum) {
			System.out.println("Neon number");
		} else {
			System.out.println("Not a Neon number");
		}
		sc.close();
	}

}
