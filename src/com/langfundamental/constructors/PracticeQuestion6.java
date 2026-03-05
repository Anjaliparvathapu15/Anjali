package com.langfundamental.constructors;

public class PracticeQuestion6 {
	int id;
	String name;

	PracticeQuestion6() {
		id = 101;
		name = "anjali";
		System.out.println("no-arg constructor called");
	}

	PracticeQuestion6(PracticeQuestion6 p) {
		System.out.println("parameterzied constructor called");
		id = p.id;
		name = p.name;

	}

	public static void main(String[] args) {
		PracticeQuestion6 p = new PracticeQuestion6();
		p.display();
		PracticeQuestion6 p1 = new PracticeQuestion6(p);
		p1.display();

	}

	void display() {
		System.out.println(id);
		System.out.println(name);
	}

}
