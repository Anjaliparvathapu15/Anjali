package com.arrays;

import java.util.Scanner;

public class ArrayElementFreq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 44, 5, 2, 3, 2, 2, 4, 5, 7, 9, 2 };
		int count = 0;
		System.out.println("Enter a value");
		int value = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				count++;
			}

		}
		System.out.println("COunt of Given Number :" + count);

		sc.close();
	}

}
