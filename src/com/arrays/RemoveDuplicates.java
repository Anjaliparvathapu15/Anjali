package com.arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 5, 7, 3, 8, 9, 0, 2, 3, 5, 6, 9 ,1,1};
		for(int i=0;i<arr.length;i++) {
			boolean duplicate=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					duplicate=true;
					break;
				}
			}
			if(!duplicate) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
