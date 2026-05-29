package com.arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[]arr= {1,2,3,5};
		int n=arr.length+1;
		int sum=0;
		int expectedSum=n*(n+1)/2;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		int missingNum=expectedSum-sum;
		System.out.println("Missing Number :"+missingNum);

	}

}
