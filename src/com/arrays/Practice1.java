package com.arrays;

import java.util.Arrays;

public class Practice1 {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 5, 5, 7, 8, 7 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.print(arr[i] + " ");
			}

			while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
				i++;
			}
		}

	}

}
