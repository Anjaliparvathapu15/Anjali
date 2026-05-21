package com.conditionalstatements;

import java.util.Scanner;

public class Calculations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		System.out.println("Enter b number :");
		int b = sc.nextInt();
		System.out.println("Enter a symbol to proceeed :");
		String sym = sc.next();
		switch (sym) {
		case "+" -> System.out.println("Addition :" + (a + b));
		case "-" -> System.out.println("Addition :" + (a - b));
		case "*" -> System.out.println("Addition :" + (a * b));
		case "/" -> System.out.println("Addition :" + (a / b));
		case "%" -> System.out.println("Addition :" + (a % b));
		default -> System.out.println("Invalid symbol");
		}
		sc.close();

	}

}
