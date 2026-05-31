package com.patterns;

public class Pattern18 {

	public static void main(String[] args) {
		int space = 4;
		int star = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			star += 2;
			space -= 1;
			System.out.println();

		}

	}

}
