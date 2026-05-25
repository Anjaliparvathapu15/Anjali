package com.arrays;

public class ArrayMinOddNum {

	public static void main(String[] args) {
		int[]arr= {1,2,3,3,4,5,6};
		int minOdd=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0&&arr[i]<minOdd) {
				minOdd=arr[i];
			}
		}
		System.out.println(minOdd);

	}

}
