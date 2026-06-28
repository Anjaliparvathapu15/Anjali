package com.arrays;

public class ObjecttypeArray {
	static int sum=0;

	public static void main(String[] args) {
		 Object[] arr = {
	                10,
	                new Object[] {
	                        20,
	                        30,
	                        new Object[] { 40, 50 }
	                },
	                150
	        };
		 	findSum(arr);
		 	System.out.println();
			System.out.println("Sum :"+sum);


	}
	static void findSum(Object arr[]) {
		for(Object element:arr) {
			if(element instanceof Object[]) {
				findSum((Object[])element);
			}
			else {
				System.out.print(element+" ");
				sum+=(Integer)element;
			}
			
		}
	}

}
