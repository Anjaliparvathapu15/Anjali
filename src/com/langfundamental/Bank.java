package com.langfundamental;

import java.util.Scanner;

public class Bank {
	static Scanner sc = new Scanner(System.in);
	int accno;
	String name;
	int balance;
	int pin;

	public static void main(String[] args) {
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		b1.balance = 2000;
		b1.accno=2291055;
		b1.name="Anjali";
		 deposit(b1);
		 //withDraw(b1);
		 pincode(b1);
		 pincode(b2);
	}

	 static void deposit(Bank b1) {
		 System.out.println("Enter the Amount to Deposit:");
		int b=sc.nextInt();
		int Amount=b1.balance+b;
		System.out.println("Total Amount:"+(Amount));
		check(Amount);
		
	}

	static void withDraw(Bank b1) {
		System.out.println("Enter deposited amount :");
		int d1 = sc.nextInt();
		System.out.println("total Amount :"+(b1.balance-d1));
	}

	static void pincode(Bank b1) {
		System.out.println("Enter pincode :");
		int d1 = sc.nextInt();
		System.out.println("pincode:"+d1);
		
	}
	static void check(int a) {
		System.out.println("enter withdraw amount:");
		int w=sc.nextInt();
		int total=a-w;
		System.out.println("total Amount:"+total);
		
	}
	
}
