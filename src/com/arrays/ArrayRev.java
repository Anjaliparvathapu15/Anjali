package com.arrays;

public class ArrayRev {
//can do with array rotation ie:swaping
	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 50, 60 };
		int start = 0;
		int end = num.length-1;
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		reverse(num, start, end);
		for(int a:num) {
			System.out.print(a+" ");
		}

	}

	static void reverse(int[] num, int start, int end) {
		int temp = 0;
		while(start<end) {
		temp = num[start];
		num[start] = num[end];
		num[end] = temp;
		start++;
		end--;
		}
	}

}
