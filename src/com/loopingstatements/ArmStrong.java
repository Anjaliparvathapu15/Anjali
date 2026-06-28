package com.loopingstatements;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int temp = n;
		int check = n;
		int count = 0;
		int sum = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		while (temp != 0) {
			int r = temp % 10;
			temp = temp / 10;
			int pow = 1;
			int count1=count;
			while (count1 > 0) {
				pow = pow * r;
				count1--;
			}
			sum = sum + pow;
		}
		if (check == sum) {
			System.out.println("ArmStrong Number");
		}

	}

}
