package com.gutquestions;

public class DuplicatesRemove {

	public static void main(String[] args) {
		int[]arr= {1,1,2,2,3,3,4,4};
		int i=0;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				continue;
			}else {
				i++;
				arr[i]=arr[j];
			}
		}
		System.out.println("Length :"+(i+1));
		for(int n=0;n<=i;n++) {
			System.out.print(arr[n]+" ");
		}
	}

}
