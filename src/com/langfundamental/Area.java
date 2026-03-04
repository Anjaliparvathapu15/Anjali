package com.langfundamental;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Radius:");
		double r = sc.nextDouble();
		System.out.println("Enter the value of base : ");
		double b = sc.nextDouble();
		System.out.println("Enter the value of height: ");
		double h = sc.nextDouble();
		areaOfCircle(r);
		System.out.printf("Area of Triangle:" + areaOfTriangle(b, h));
		sc.close();

	}

	static void areaOfCircle(double radius) {
		double areaOfCircle = Math.PI * radius * radius;
		System.out.println("Area of Circle:" + areaOfCircle);

	}

	static double areaOfTriangle(double base, double height) {
		double areaOfTriangle = 0.5 * base * height;
		return areaOfTriangle;

	}

	static double areaOfRectangle(double length, double bredth) {
		double areaOfRectangle = length * bredth;
		return areaOfRectangle;

	}

}
