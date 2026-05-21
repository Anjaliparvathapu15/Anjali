package com.conditionalstatements;

import java.util.Scanner;

public class TshirtSizeDesUsingSwitch {

	public static void main(String[] args) {
		System.out.println("Enter the T-shirt Size:");
		Scanner sc = new Scanner(System.in);
		int tshirtsize = sc.nextInt();
		switch (tshirtsize) {
		case 32 -> System.out.println("Small size");
		case 36 -> System.out.println("Medium size");
		case 40 -> System.out.println("Large size");
		case 42 -> System.out.println("Extra Large size");
// Case constant of type double is incompatible with switch selector type int
//case 45.5->System.out.println("*****");
		default -> System.out.println("Invalid size");
		}
		sc.close();

	}

}
