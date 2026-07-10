package com.gutquestions;

public class BinarySearch {

	public static void main(String[] args) {
		int[]arr= {10,20,30,40,50};
		int start=0;
		int end=arr.length-1;
		int target=40;
		int index=-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) {
				index=mid;
				break;
			}else if(target<arr[mid]) {
				end=mid-1;
			}else if(target>arr[mid]) {
				start=mid+1;
			}
			
		}
		System.out.println(index);

	}

}
