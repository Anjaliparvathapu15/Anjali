package com.langfundamental.constructors;

public class PracticeQuestion4 {
	int id;
	String name;

	PracticeQuestion4() {
		//this(1, "teja");
		System.out.println("no-arg");
		this(1,"teja");
	}

	PracticeQuestion4(int id, String name) {
		System.out.println("parameterized ");
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		PracticeQuestion4 p1 = new PracticeQuestion4();
		p1.show();
		PracticeQuestion4 p = new PracticeQuestion4(101, "Anjali");
		p.show();
	}
	void show() {
		System.out.println(id);
		System.out.println(name);
	}

}
