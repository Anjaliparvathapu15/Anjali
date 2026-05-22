package com.arrays;

public class ArrayStringContainsMethod {

	public static void main(String[] args) {
		System.out.println("Main method started");
		String[]num=new String[3];
		num[0]="Anjali";
		num[1]="Teja";
		num[2]="Vinay";
		for(int i=0;i<num.length;i++) {
			if(num[i].contains("e")) {
				System.out.println(num[i]);
			}
		}
				

	}

}
