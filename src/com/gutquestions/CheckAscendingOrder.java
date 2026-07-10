package com.gutquestions;

public class CheckAscendingOrder {

	public static void main(String[] args) {
		int[]arr= {10,20,30,40};
		boolean sort=sorted(arr);
		System.out.println(sort);
	}
	static boolean sorted(int[]arr) {
		boolean status=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				status=false;
			}
		}
		return status;
	}
}
