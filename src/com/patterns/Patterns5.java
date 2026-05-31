package com.patterns;

public class Patterns5 {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int k = 5; k >i; k--) {
				System.out.print("*");
			}
			for (int j = 5; j > 5; j++) {
				System.out.print(" ");
			}
//			for (int k = 5; k >= i; k--) {
//				System.out.print("*");
//			}
			System.out.println();
		}

	}

}
