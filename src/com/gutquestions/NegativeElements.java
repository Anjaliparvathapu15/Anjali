package com.gutquestions;

public class NegativeElements {
	void otherWay(int[]arr){
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			while(arr[start]<0) {
				start++;
			}
			while(arr[end]>=0) {
				end--;
			}
			if(start<end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

	 void main(String[] args) {
		int[]arr= {1,-2,3,-4,5,-6};
		int[]arr1=new int[arr.length];
		int index=0;
		otherWay(arr);
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<0) {
//				arr1[index++]=arr[i];
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>0) {
//			arr1[index++]=arr[i];
//			}
//		}
//		for(int a:arr1) {
//			System.out.print(a+" ");
//		}
	}

}
