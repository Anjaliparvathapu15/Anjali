package com.arrays;

class CountDuplicates {
	public static void main(String args[]) {

		int arr[] = { 1, 1, 1,3, 5, 7, 3, 8, 9, 0, 2, 3, 5, 6, 9 };

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			boolean alreadyChecked = false;

			// Check whether element appeared before
			for (int k = 0; k < i; k++) {

				if (arr[i] == arr[k]) {
					alreadyChecked = true;
					break;
				}
			}

			if (alreadyChecked)
				continue;

			// Check if duplicate exists
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}

		System.out.println("Duplicate count = " + count);
	}
}
