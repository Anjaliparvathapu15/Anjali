package com.arrays;

import java.util.Scanner;

public class CircularArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int size=sc.nextInt();
		int[]arr=new int[size];
		int []arr1=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			boolean found=false;
			arr1[i]=-1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					arr1[i]=arr[j];
					found=true;
					break;
				}
			}
			if(found==false) {
			for(int k=0;k<i;k++) {
				if(arr[i]<arr[k]) {
					arr1[i]=arr[k];
					break;
				}
				
			}
			}
		}
		for(int a:arr1) {
		System.out.print(a+" ");
		}

	}

}
