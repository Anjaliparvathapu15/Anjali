package com.consolebasedapps;

import java.util.Scanner;

public class GuessTheNumber {

	static Scanner sc = new Scanner(System.in);
	static int Random;

	static void Hint() {
		System.out.println("(Cheater Hint: Target is " + Random + ")");
	}

	static char show;

	static void check() {
		System.out.println("***********************************");
		System.out.println("Do you want show the Random number");
		System.out.println("***********************************");
		System.out.println("Do you want to Show Yes/No");
		show = sc.next().charAt(0);
		if ('y' == Character.toLowerCase(show)) {
			Hint();
		}
	}

	public static void main(String[] args) {
		System.out.println("Computer generated a Random number");
		char ch;
		do {
			Random = (int) (Math.random() * 100) + 1;

			int count = 3;
			boolean isWon = false;

			while (count > 0) {
				System.out.println("enter yours number you have " + count + " chances");
				int num = sc.nextInt();

				if (Random == num) {
					System.out.println("Successfully found with in Remaining " + count + " chances");
					isWon = true;
					break;
				} else if (Random < num) {
					System.out.println("***********************************");
					System.out.println("Random number is less than " + num);
					if (count != 1) {
						check();
					}

				} else {
					System.out.println("***********************************");
					System.out.println("Random number is greater than " + num);
					if (count != 1) {
						check();
					}
				}
				count--;
			}
			if (!isWon) {
				System.out.println("Game Over! You ran out of chances. The number was: " + Random);
			}
			System.out.println("Do you want to contine Yes/No");
			ch = sc.next().charAt(0);

		} while (Character.toLowerCase(ch) == 'y');
		System.out.println("Thanks for playing!");
		sc.close();
	}
}
