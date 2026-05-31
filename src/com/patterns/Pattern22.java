package com.patterns;

public class Pattern22 {

	public static void main(String[] args) {
		int star = 1;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			if (i < 4) {
				star += 1;

			} else {
				star -= 1;
			}
			System.out.println();
		}

	}
}
