package com.gutquestions;

public class DuplicateElement {
	//1to n elements only one element is repeated more times.
	void multipleDup(int[]arr) {
		boolean status=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					status=true;
					break;
				}
			}
			if(status==true) {
				break;
			}
		}
	}

	 void main(String[] args) {
		
		//for 1 to n elements in that one element is duplicate print the duplicate number.
		int[]arr= {1,3,4,2,2};
		int[]arr1= {1,2,3,3,3,3,4};
		System.out.println("the array arr1 duplaicte is :");
		multipleDup(arr1);
		int n=arr.length-1;
		int totalSum=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int duplicateNumber=sum-totalSum;
		System.out.println("the array arr duplicate elemnt :");
		System.out.println(duplicateNumber);
		
	}

}
