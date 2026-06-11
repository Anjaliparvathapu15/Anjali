package com.conditionalstatements;

import java.util.Scanner;

public class Passenger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of passenger  :");
		int age=sc.nextInt();
		if(age<5) {
			System.out.println("Free Ticket");
			System.out.println("Fare :Rs.0");
		}
		else if(age>=5 && age<=12) {
			System.out.println("Child Ticket");
			System.out.println("Fare :Rs.20");
		}else if(age>=13 && age<=59) {
			System.out.println("Regular Tickect");
			System.out.println("Fare :Rs.50");
		}else {
			System.out.println("Senior Citizen Ticket");
			System.out.println("Fare :Rs.30");
		}
		sc.close();

	}

}
