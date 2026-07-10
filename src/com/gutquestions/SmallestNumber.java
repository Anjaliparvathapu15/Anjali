package com.gutquestions;

public class SmallestNumber {

	public static void main(String[] args) {
		int[]arr= {12,45,67,23,89,34,2};
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		System.out.println(smallest);

	}

}
