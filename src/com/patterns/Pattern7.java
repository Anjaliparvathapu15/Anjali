package com.patterns;

public class Pattern7 {

		public static void main(String[] args) {
			int i, j;
			for (i = 0; i <= 4; i++) {
				for (j = 0; j <= 4; j++) {
					if (i == j || i + j == 4) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}

	}

