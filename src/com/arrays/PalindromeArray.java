package com.arrays;

public class PalindromeArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 1,7 };
		int start = 0;
		int end = arr.length - 1;
		boolean ispalindrome = true;
		while (start < end) {
			if (arr[start] != arr[end]) {
				ispalindrome = false;
				break;
			}
			start++;
			end--;
		}
		System.out.println("The Array is Palindrome : " + ispalindrome);

	}

}
