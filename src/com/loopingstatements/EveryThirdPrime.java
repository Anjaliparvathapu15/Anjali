package com.loopingstatements;

import java.util.Scanner;

public class EveryThirdPrime {
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers to print :");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;count<n;i++) {
			if(isPrime(i)) {
				if(count%3==0) {
					System.out.print(i+" ");
				}
				count++;
				
			}
		}
		sc.close();

	}

}
