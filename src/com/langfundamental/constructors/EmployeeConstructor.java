package com.langfundamental.constructors;

public class EmployeeConstructor {
	int id;
	String name;
	double salary;

	EmployeeConstructor() {
		System.out.println(" No-arg Constructor ");
	}

	EmployeeConstructor(int id, String name) {
		System.out.println("Parameterized constructor 1");
		this.id = id;
		this.name = name;

	}

	EmployeeConstructor(int id, String name, double salary) {
		System.out.println("Parameterized constructor 2");
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public static void main(String[] args) {
		EmployeeConstructor e = new EmployeeConstructor();
		EmployeeConstructor e1 = new EmployeeConstructor(1, "teja");
		EmployeeConstructor e2 = new EmployeeConstructor(2, "vinay", 200000);
		e.display();
		e1.display();
		e2.display();
	}

	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}

}
