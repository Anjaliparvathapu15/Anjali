package com.patterns;

public class Pattern19 {

	public static void main(String[] args) {
		int star=9;
		int space=0;
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			
			star-=2;
			space+=1;
			System.out.println();
		}

	}

}
