package com.conditionalstatements;

import java.util.Scanner;

public class CricketerInfoUsingSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the jersey number :");
		int jerseyNo=sc.nextInt();
		switch(jerseyNo) {
		case 7:
			System.out.println("Thala for a reason");
			break;
		case 18:
			System.out.println("King Kohili");
			break;
		case 45 :
			System.out.println("Best Caption");
			break;
		default:
			System.out.println("Entered jersey number info in not added");
			break;
		}
		System.out.println("*********");
		sc.close();
	}

}
