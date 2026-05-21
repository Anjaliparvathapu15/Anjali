package com.loopingstatements;

public class EvenOrOddNumberPrinting {

	public static void main(String[] args) {
		System.out.println("Even numbers upto 100 :");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("Odd numbers upto 100 :");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

	}

}
