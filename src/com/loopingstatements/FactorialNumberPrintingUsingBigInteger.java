package com.loopingstatements;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialNumberPrintingUsingBigInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
		sc.close();
	}

}
