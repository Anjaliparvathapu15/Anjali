package com.loopingstatements;

import java.util.Scanner;

public class EvenOddWithRecursion {
	static void evenodd(int n) {
		if(n==0) {
			System.out.println("Even");
		}
		else if(n==1) {
			System.out.println("Odd");
		}
		else {
			evenodd(n-2);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		evenodd(n);

	}

}
