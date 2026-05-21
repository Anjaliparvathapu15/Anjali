package com.langfundamental.constructors;

public class Emp {
	int id;
	String name;
	double salary;

	Emp() {
		this(101);
		System.out.println("Emp no-arg constructor");
	}

	Emp(int id) {
		this(id, "Anjali");
		System.out.println("1-arg");
	}

	Emp(int id, String name) {
		this(id, name, 15000.00);
		System.out.println("2-arg");
	}

	Emp(int id, String name, double salary) {
		System.out.println("3-arg");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		System.out.println("Main methsod strated");
		Emp e = new Emp();
		e.display();

	}

	void display() {
		System.out.println("Id= " + id);
		System.out.println("Name= " + name);
		System.out.println("salary= " + salary);
	}

}
