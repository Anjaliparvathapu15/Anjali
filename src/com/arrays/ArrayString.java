package com.arrays;

import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = sc.nextInt();
		String[] name = new String[size];
		for (int i = 0; i < size; i++) {
			name[i] = sc.next();
		}
		for (String n : name) {

			if (n.toLowerCase().startsWith("a") && n.endsWith("i"))

			{
				System.out.println(n);
			}

		}
		sc.close();
	}

}
