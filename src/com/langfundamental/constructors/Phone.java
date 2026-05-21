package com.langfundamental.constructors;

class Device {
	String brand;
}

public class Phone extends Device {
	String simType;
}

class SmartPhone extends Phone {
	int ram;
	int storage;

	SmartPhone(String brand, String simType, int ram, int storage) {
		System.out.println("4-arg constructor");
		super.brand = brand;
		super.simType = simType;
		this.ram = ram;
		this.storage = storage;
	}

	public static void main(String[] args) {
		SmartPhone s = new SmartPhone("samsung", "jio", 12, 512);
		s.display();
	}

	void display() {
		System.out.println(brand);
		System.out.println(simType);
		System.out.println(ram);
		System.out.println(storage);
	}
}
