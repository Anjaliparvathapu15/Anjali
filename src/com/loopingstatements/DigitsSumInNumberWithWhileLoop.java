package com.loopingstatements;

import java.util.Scanner;

public class DigitsSumInNumberWithWhileLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		int r=0;
		int sum=0;
		while(n!=0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		System.out.println("Sum of Digits :"+sum);
		sc.close();
	}

}
