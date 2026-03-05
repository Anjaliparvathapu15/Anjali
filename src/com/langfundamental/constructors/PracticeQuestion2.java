package com.langfundamental.constructors;

public class PracticeQuestion2 {
	int id;
	String name;

	PracticeQuestion2() {
		System.out.println("no-arg constructor");
	}

	PracticeQuestion2(int id, String name) {
		this();
		System.out.println("parameterized constructor");
		// this();
		this.id = id;
		this.name = name;
		// this();

	}

	public static void main(String[] args) {
		PracticeQuestion2 p = new PracticeQuestion2(45, "Rohit");
		p.show();
	}

	void show() {
		System.out.println(id);
		System.out.println(name);
	}

}
