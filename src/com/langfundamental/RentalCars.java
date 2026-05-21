package com.langfundamental;

import java.util.Scanner;

public class RentalCars {

	public static void main(String[] args) {
		RentalCars r = new RentalCars();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of days :");
		int days = sc.nextInt();
		int totalRent = r.totalRent(days);
		System.out.println("Total Rent for Car :" + totalRent);
		sc.close();

	}

	String welcome() {
		String name = "welcome to java";
		return name;
	}

	int dailyRent() {
		int dailyRent = 1000;
		return dailyRent;
	}

	int insurance() {
		int insurance = 500;
		return insurance;
	}

	int totalRent(int days) {
		int total = days * dailyRent() + insurance();
		return total;
	}

}
