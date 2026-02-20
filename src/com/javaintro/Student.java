package com.javaintro;

public class Student {
	static String schoolName="MRCE";
	static void school() {
		System.out.println("Before name of the school is: "+schoolName);
		schoolName="MALLA REDDY COLLEGE OG ENGINEERING";
		System.out.println("After name of the school is: "+schoolName);
	}
	public static void main(String[] args) {
		school();
	}
}
