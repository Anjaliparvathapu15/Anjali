package com.gutquestions;

public class PeakElement {

	public static void main(String[] args) {
		int[]arr= {1,0,3,2,20,4,1,0};
		
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				if(arr[i]>arr[i+1]) {
					System.out.print(arr[i]+" ");
				}
			}else if(i<arr.length-1) {
				if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]) {
					System.out.print(arr[i]+" ");
				}
			}else {
				if(arr[i]>arr[i-1]) {
					System.out.print(arr[i]+" ");
				}
			}
		}

	}

}
