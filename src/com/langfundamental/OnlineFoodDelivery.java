package com.langfundamental;

import java.util.Scanner;

public class OnlineFoodDelivery {

	public static void main(String[] args) {
		OnlineFoodDelivery p1 = new OnlineFoodDelivery();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Price:");
		double price = sc.nextDouble();
		System.out.println("Enter the quantity:");
		double quantity = sc.nextDouble();
		double basicAmount = p1.calculateItemTotal(price, quantity);
		double gstAmount = p1.addGst(basicAmount);
		double finalAmount=p1.addDeliveryCharges(gstAmount);
		p1.printBill(finalAmount);
		sc.close();
	}

	double calculateItemTotal(double price, double quantity) {
		double basicBill = price * quantity;
		return basicBill;
	}

	double addGst(double amount) {
		double gstAmount = amount+(amount * 5) / 100;
		return gstAmount;
	}

	double addDeliveryCharges(double amount) {
		double deliveryAmount = amount + 40;
		return deliveryAmount;
	}
	void printBill(double finalAmount) {
		System.out.println("Total Bill:"+finalAmount);
	}

}
