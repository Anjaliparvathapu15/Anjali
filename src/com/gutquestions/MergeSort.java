package com.gutquestions;

public class MergeSort {

	public static void main(String[] args) {
		int[]arr= {38,27,43,3,9,82,10};
		divideArray(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

	 static void divideArray(int[] arr) {
		 if(arr.length==1) {
			 return;
		 }
		int[]left=new int[arr.length/2];
		int[]right=new int[arr.length-left.length];
		for(int i=0;i<left.length;i++) {
			left[i]=arr[i];
		}
		for(int i=0;i<right.length;i++) {
			right[i]=arr[left.length+i];
		}
		divideArray(left);
		divideArray(right);
		mergeSort(arr,left,right);
	}

	 static void mergeSort(int[] arr, int[] left, int[] right) {
		 int i=0;
		 int j=0;
		 int k=0;
		 while(i<left.length && j<right.length) {
			 if(left[i]<right[j]) {
				 arr[k++]=left[i++];
			 }else {
				 arr[k++]=right[j++];
			 }
		 }
		 while(i<left.length) {
			 arr[k++]=left[i++];
		 }
		 while(j<right.length) {
			 arr[k++]=right[j++];
		 }
		
	 }

}
