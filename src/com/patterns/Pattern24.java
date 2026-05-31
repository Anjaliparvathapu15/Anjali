package com.patterns;

public class Pattern24 {

	public static void main(String[] args) {
		int star=1;
		int ash=1;
		int space=4;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			for(int l=1;l<=ash;l++) {
				System.out.print("#");
			}
			star+=1;
			ash+=1;
			space-=1;
			System.out.println();
		}

	}

}
