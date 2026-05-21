package com.langfundamental.constructors;

class vehicle {
	String brand;

	vehicle(String brand) {
		this.brand = brand;
	}

}

class car1 extends vehicle {
	String name;
	String modal;
	double price;

	car1(String brand, String name, String modal, double price) {
		super(brand);
		this.name = name;
		this.modal = modal;
		this.price = price;
	}

}

public class BatteryCar extends car1 {
	int batteryCapacity;

	BatteryCar(int batteryCapacity, String brand, String name, String modal, double price) {
		this.batteryCapacity = batteryCapacity;
		super(brand, name, modal, price);
	}

	public static void main(String[] args) {
		BatteryCar c = new BatteryCar(45, "toyota", "honda", "1111", 100000);
		c.display();

	}
	void display() {
		System.out.println("Brand of the car:" + brand);
		System.out.println("Name of the car:" + name);
		System.out.println("Model pf the car:" + modal);
		System.out.println("Price of the car:" + price);
		System.out.println("Battey capacity:"+batteryCapacity);
	}

}
