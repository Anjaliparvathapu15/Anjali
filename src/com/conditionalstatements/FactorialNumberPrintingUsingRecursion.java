package com.conditionalstatements;

import java.util.Scanner;

public class FactorialNumberPrintingUsingRecursion {
	static int factorial(int n) {
		if(n==0||n==1) {
			return 1;
		}
		return n*factorial(n-1);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int result=factorial(n);
		System.out.println("Factorial of number "+n+" is "+result);
		sc.close();
	}

}
