package com.arrays;

public class ThirdMax {

	public static void main(String[] args) {
		int[]arr= {10,20,4,45,45,99};
		int firstMax=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		int thirdMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstMax) {
				thirdMax=secondMax;
				secondMax=firstMax;
				firstMax=arr[i];
			}else if(secondMax<arr[i]&& arr[i]!=firstMax) {
				thirdMax=secondMax;
				secondMax=arr[i];
			}else if(thirdMax<arr[i]&&arr[i]!=secondMax) {
				thirdMax=arr[i];
			}
		}
		System.out.println(thirdMax);
		System.out.println(secondMax);
		System.out.println(firstMax);
	}

}
