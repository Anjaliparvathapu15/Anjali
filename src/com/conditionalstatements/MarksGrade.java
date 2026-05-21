package com.conditionalstatements;

import java.util.Scanner;

public class MarksGrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks Percentage :");
		int marksp=sc.nextInt();
		if(marksp>100 ||marksp<0) {
			System.out.println("Entered Marks are Invalid");
		}
		else if(marksp>=90) {
			System.out.println("A Grade");
		}
		else if(marksp>=80) {
			System.out.println("B Grade");
		}
		else if(marksp>=70) {
			System.out.println("C Grade");
		}
		else if(marksp>=60) {
			System.out.println("D Grade");
		}
		else if(marksp>=50) {
			System.out.println("Just Passed");
		}
		else {
			System.out.println("Failed");
		}
		sc.close();

	}

}
