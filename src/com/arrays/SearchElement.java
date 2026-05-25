package com.arrays;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 11, 13 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an element:");
		int val = sc.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				System.out.println("Number found");
				count++;
				break;
			}

		}
		if (count == 0) {
			System.out.println("number not exsist");
		}
		sc.close();
	}

}
