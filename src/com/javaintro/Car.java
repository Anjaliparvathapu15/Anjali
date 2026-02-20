package com.javaintro;

public class Car {
	String brand="BMW";
	int price=1000;
	void Method1() {
		System.out.println(brand);
		System.out.println(price);
	}

	 public static void main(String[] args) {
		 
		 Car c1=new Car();
		 c1.Method1();

	}

}
