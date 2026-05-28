package com.arrays;

public class DuplicateNumCount {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 3, 5, 7, 3, 8, 9, 0, 2, 3, 5, 6, 9 };
		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == true) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			System.out.println(arr[i] + " count " + count + " times ");
		}

	}

}
