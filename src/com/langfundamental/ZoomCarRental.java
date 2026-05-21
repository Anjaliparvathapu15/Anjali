package com.langfundamental;

import java.util.Scanner;

public class ZoomCarRental {

	public static void main(String[] args) {
		ZoomCarRental c=new ZoomCarRental();
		System.out.println("Name of the Company :"+c.name());
		Scanner sc=new Scanner(System.in);
		System.out.println("no.of days:");
		int days=sc.nextInt();
		System.out.println("total Rent:"+c.totalCost(days));
		sc.close();

	}
	String name() {
		String name="Zoom Car Company";
		return name;
	}
	int fixedDailyRent() {
		int dailyRent=1500;
		return dailyRent;
	}
	int baseRent(int days) {
		
		int baseRent=days*fixedDailyRent();
		return baseRent;
	}
	int fixedInsurance() {
		int insurance=500;
		return insurance;
	}
	int totalCost(int days) {
		int totalRent=baseRent(days)+fixedInsurance();
		return totalRent;
	}

}
