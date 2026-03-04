package com.langfundamental;

import java.util.Scanner;

public class PracticeQuestion3 {
	static Scanner sc = new Scanner(System.in);
	String name;
	double marks1;
	double marks2;
	double marks3;
	double totalMarks;
	double average;

	PracticeQuestion3() {
		System.out.println("Enter Marks1:");
		marks1 = sc.nextDouble();
		System.out.println("Enter Marks2:");
		marks2 = sc.nextDouble();
		System.out.println("Enter Marks3:");
		marks3 = sc.nextDouble();
		totalMarks = marks1 + marks2 + marks3;
		average = totalMarks / 3;
		System.out.println("Total Marks:" + totalMarks);
		System.out.println("Average Marks:" + average);
	}

	public static void main(String[] args) {
		PracticeQuestion3 p = new PracticeQuestion3();

		PracticeQuestion3 p1 = new PracticeQuestion3();

	}

}
