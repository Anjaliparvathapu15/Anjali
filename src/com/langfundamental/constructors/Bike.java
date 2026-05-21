package com.langfundamental.constructors;

class Vehile {
	Vehile() {
		System.out.println("Vehile no-arg");
	}

	Vehile(String name, double price, String brand) {
		System.out.println("3-arg Vehile constructor called");
	}

}

public class Bike extends Vehile {
	Bike() {
		System.out.println("Bike no-arg");
	}

	Bike(String name, double price, String brand) {
		super(name, price, brand);
		System.out.println("3-arg Bike constructor called");
	}

	public static void main(String[] args) {
		Bike b = new Bike();
		Bike b1 = new Bike("f-z", 150000.00, "Honda");
	}

}
