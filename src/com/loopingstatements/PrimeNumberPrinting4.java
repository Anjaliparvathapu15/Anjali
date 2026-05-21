package com.loopingstatements;

public class PrimeNumberPrinting4 {
	static boolean isPrime(int n){
		boolean status=true;
		if(n<=1) {
			status=false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		for(int i=2;i<=100;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}

	}

}
