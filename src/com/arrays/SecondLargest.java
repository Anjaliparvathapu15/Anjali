package com.arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[]arr= {1,2,3,44,55,101,77,99,0};
		int firstlargest=arr[0];
		int secoundlargest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstlargest) {
				firstlargest=arr[i];
			}
		}
		System.out.println("First Largest :"+firstlargest);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secoundlargest && arr[i]!=firstlargest) {
				secoundlargest=arr[i];
			}
		}
		System.out.println("Secound Largest number :"+secoundlargest);

	}

}
