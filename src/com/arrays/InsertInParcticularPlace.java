package com.arrays;

public class InsertInParcticularPlace {

	public static void main(String[] args) {
		int[]arr= {10,20,30,40,50,60};
		int position=2;
		int element=25;
		int[]arr1=new int[arr.length+1];
		for(int i=0;i<position;i++) {
			arr1[i]=arr[i];
		}
		arr1[position]=element;
		for(int i=position;i<arr.length;i++) {
			arr1[i+1]=arr[i];
		}
		System.out.println("Array After Inserting Element :");
		for(int a:arr1) {
			System.out.print(a+" ");
		}
		

	}

}
