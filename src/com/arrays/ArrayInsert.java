package com.arrays;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		int[] arr3 = new int[size];
		int evenIndex = 0;
		int oddIndex = 0;
		for (int i = 0; i < size; i++) {
			arr1[i] = sc.nextInt();
			if (arr1[i] % 2 == 0) {
				arr2[evenIndex] = arr1[i];
				evenIndex++;
			} else {
				arr3[oddIndex] = arr1[i];
				oddIndex++;
			}
		}
		System.out.println("arr2 elements");
		for (int i = 0; i < evenIndex; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("arr3 elements");
		for (int i = 0; i < oddIndex; i++) {
			System.out.println(arr3[i]);
		}
		sc.close();
	}

}
