package com.conditionalstatements;

import java.util.Scanner;

public class SwitchWithReturn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day :");
		int day = sc.nextInt();
		System.out.println(getDayInfo(day));
		sc.close();

	}

	static String getDayInfo(int day) {
		switch (day) {
		case 1 -> {
			return "Monday";
		}
		case 2 -> {
			return "Tuesday";
		}
		case 3 -> {
			return "Wednesday";
		}
		default -> {
			return "Invalid";
		}
		}

	}

}
