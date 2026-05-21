package com.langfundamental.constructors;

class Vehicle {
	String brand;

	Vehicle(String brand) {
		this.brand = brand;
	}
}

class Car extends Vehicle {
	String name;
	String model;
	double price;

	Car(String name, String model, double price) {
		super("Toyota");
		this.name = name;
		this.model = model;
		this.price = price;
	}
}

public class ElectricCar extends Car {
	int batteryCapacity;

	ElectricCar(int batteryCapacity) {
		super("Tata", "honda", 2000.00);
		this.batteryCapacity = batteryCapacity;
	}

	public static void main(String[] args) {
		ElectricCar e = new ElectricCar(45);
		e.display();
	}

	void display() {
		System.out.println("Brand of the car:" + brand);
		System.out.println("Name of the car:" + name);
		System.out.println("Model pf the car:" + model);
		System.out.println("Price of the car:" + price);
		System.out.println("Battey capacity:"+batteryCapacity);
	}

}
