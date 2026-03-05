package com.langfundamental.constructors;

import java.util.Scanner;

public class PracticeQuestion7 {
	static Scanner sc = new Scanner(System.in);
	double price;

	PracticeQuestion7() {
		System.out.println("enter the value of price:");
		price = sc.nextDouble();
		addBonus();

	}

	public static void main(String[] args) {
		PracticeQuestion7 p = new PracticeQuestion7();

	}

	void addBonus() {
		double addBonus = price + (price * 5) / 100;
		System.out.println("Total Amount:" + addBonus);

	}

}
