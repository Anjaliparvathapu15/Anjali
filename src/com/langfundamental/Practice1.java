package com.langfundamental;

import java.util.Scanner;

public class Practice1 {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		System.out.println("Enter a value:");
		int b = sc.nextInt();
		System.out.println("enter fname value:");
		sc.nextLine();
		String fname = sc.nextLine();
		System.out.println("Enter s value: ");
		int s = sc.nextInt();
		System.out.println("enter gender:");
		char gen=sc.next().charAt(0); 
		int sum = printSum(a, b);
		System.out.println("sum is:" + sum);
		System.out.println("square of " + s + ':' + printSquare(s));
		print(fname);
		gender(gen);
		sc.close();

	}

	int printSum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	void print(String name) {
		String fname = name;
		System.out.println(fname);
	}

	void gender(char gen) {
		System.out.println(gen);
	}

	int printSquare(int s) {
		int square = s * s;
		return square;
	}

}
