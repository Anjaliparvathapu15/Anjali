package com.gutquestions;

public class Subset {

	public static void main(String[] args) {
		int []a= {1,2,3,4};
		int[]b= {2,3,5};
		boolean status=true;
		for(int i=0;i<b.length;i++) {
			boolean found=false;
			for(int j=0;j<a.length;j++) {
				if(a[j]==b[i]) {
				found=true;
				break;	
				}
			}
			if(!found) {
				status=false;
				break;
			}
		}
		if(status) {
			System.out.println("b is subset of a");
		}else {
			System.out.println("not a seb set");
		}
	}

}
