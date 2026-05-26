package com.arrays;
//WAP to print the duplicate elements and count of the elements which are repeated
public class DuplicateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 5, 7, 3, 8, 9, 0, 2, 3, 5, 6, 9 };
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j]+" ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("count :"+count);

	}

}
