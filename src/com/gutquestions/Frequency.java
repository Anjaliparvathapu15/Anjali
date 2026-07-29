package com.gutquestions;

public class Frequency {

	public static void main(String[] args) {
		int[]arr= {1, 2, 2, 3, 1, 4, 2};
		boolean[] visited=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(visited[i]==true) {
				continue;
			}
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visited[j]=true;
				}
			}
			System.out.println("Count of "+arr[i]+" is "+count);
		}
	}

}
