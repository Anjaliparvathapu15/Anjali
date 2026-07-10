package com.arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
//		for (int i = 0; i < arr.length; i++) {
//			int product = 1;
//			for (int j = 0; j < arr.length; j++) {
//				if (i == j) {
//					continue;
//				}
//				product *= arr[j];
//			}
//			System.out.print(product+" ");
//		}
		
//		for(int i=0;i<arr.length;i++) {
//			int product=24;
//			product/=arr[i];
//			System.out.println(product);
//		}


		        int n = arr.length;

		        int[] result = new int[n];

		        // Prefix products
		        result[0] = 1;
		        for (int i = 1; i < n; i++) {
		            result[i] = result[i - 1] * arr[i - 1];
		        }

		        // Suffix products
		        int suffix = 1;
		        for (int i = n - 1; i >= 0; i--) {
		            result[i] *= suffix;
		            suffix *= arr[i];
		        }

		        for (int num : result) {
		            System.out.print(num + " ");
		        }
		    }
		}

	


