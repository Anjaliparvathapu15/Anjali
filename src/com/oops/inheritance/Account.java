package com.oops.inheritance;

import java.util.Scanner;

public class Account {
	static Scanner sc = new Scanner(System.in);
	String customerName;
	String accountNo;
	double balance;

	void customerDetail() {
		System.out.println("Enetr Account number :");
		accountNo = sc.next();
		System.out.println("Enter Customer Name :");
		sc.nextLine();
		customerName = sc.nextLine();
		System.out.println("Enter Customer Balance :");
		balance = sc.nextDouble();
	}

	void deposite() {
		System.out.println("Enter the Amount to Deposite :");
		double deposite = sc.nextDouble();
		balance += deposite;
		System.out.println("Amount ");
	}

	void withdraw() {
		System.out.println("Enter the Amount to Withdraw :");
		double withdraw = sc.nextDouble();
		if (withdraw <= balance) {
			balance -= withdraw;
			System.out.println("Amount withdrawn Successfully");
			System.out.println("Current Balance :Rs." + balance);
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	void checkBalance() {
		System.out.println("Current Balance :Rs." + balance);
	}

	double getInterestRate() {
		return 0;
	}

}
