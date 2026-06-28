package com.loopingstatements;

import java.util.Scanner;

public class GCDAndLCM {
	static int gcd(int n1,int n2) {
		while(n2!=0) {
			int temp=n2;
			n2=n1%n2;
			n1=temp;
		}
		return n1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter first number :");
		int n1=sc.nextInt();
		System.out.println("Enter second number :");
		int n2=sc.nextInt();
		int lcm=(n1*n2)/gcd(n1,n2);
		System.out.println("LCM :"+lcm);

	}

}
