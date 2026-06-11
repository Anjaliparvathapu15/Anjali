package com.consolebasedapps;

import java.util.Scanner;

public class ATMMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Amount :");
		double balance = sc.nextDouble();
		System.out.println("ATM Menu");
		System.out.println("1.Check Balnance");
		System.out.println("2.Deposite");
		System.out.println("3.WithDraw");
		System.out.println("4.Exit");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		String continueProcess;
		do {
			switch (choice) {
			case 1 -> {
				System.out.println("Total Balnce :" + balance);
			}
			case 2 -> {
				System.out.println("Enter deposite Amount :");
				double deposite = sc.nextDouble();
				if (deposite > 0) {
					balance += deposite;
					System.out.println("Deposited Successfully");
					System.out.println("Updated Amount :" + balance);
				} else {
					System.out.println("Invalid Amount ");
				}
			}
			case 3 -> {
				System.out.println("Enter withdraw amount :");
				double withdraw = sc.nextDouble();
				if (withdraw <= 0) {
					System.out.println("Invalid Withdraw Amount ");
				} else if (withdraw <= balance) {
					balance -= withdraw;
					System.out.println("Amount Withdraw Successfully");
					System.out.println("Remaining Amount :" + balance);
				} else {
					System.out.println("Insufficient Balance! ");
				}
			}
			case 4 -> {
				System.out.println("Thank you for using ATM services");
			}
			default -> {
				System.out.println("Invalid Choice ");
			}

			}
			System.out.println("Do you want to continue Trascations :");
			continueProcess = sc.next();
		} while (continueProcess.equalsIgnoreCase("yes"));
		sc.close();
	}

}
