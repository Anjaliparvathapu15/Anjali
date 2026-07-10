package com.arrays;

public class NegativeElements {

	public static void main(String[] args) {
		int []arr= {-2,3,6,1,-1,-3,4,-5};
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<0) {
//				int temp=arr[i];
//				int j=i;
//				while(j>0 && arr[j-1]>=temp) {
//					arr[j]=arr[j-1];
//					j--;
//				}
//				arr[j]=temp;
//			}
//			
//		}
		int []arr1= {3,4,6,7,9,13,11,10};
		for(int i=0;i<arr1.length;i++) {
			if(isPrime(arr1[i])) {
				int temp=arr1[i];
				int j=i;
				while(j>0 && !isPrime(arr1[j-1])) {
					arr1[j]=arr1[j-1];
					j--;
				}
				arr1[j]=temp;
			}
		}
		for(int a:arr1) {
			System.out.print(a+" ");
		}

	}

	 static boolean isPrime(int n) {
		 if(n<=0) {
			 return false;
		 }
		 for(int i=2;i<n;i++) {
			 if(n%i==0) {
				 return false;
			 }
		 }
		return true;
	}

}
