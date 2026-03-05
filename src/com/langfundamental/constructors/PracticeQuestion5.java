package com.langfundamental.constructors;

public class PracticeQuestion5 {
	String bookName;
	String authorName;
	double price;
	String releasedDate;

	PracticeQuestion5() {
		this("wing of fire");
		System.out.println("no-arg constructor called");

	}

	PracticeQuestion5(String bookName) {
		this("nenu", "ravi");
		System.out.println("one-arg consrtuctor called");

	}

	PracticeQuestion5(String bookName, String authorName) {
		this("ravi", "ravi", 20);
		System.out.println("two-arg constructor called");
	}

	PracticeQuestion5(String bookName, String authorName, double price) {
		this("amma dairy lo konni pagilu", "ravi", 80, "15-08-2004");
		System.out.println("three-arg constructor  called");
	}

	PracticeQuestion5(String bookName, String authorName, double price, String releasedDate) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.releasedDate = releasedDate;

		System.out.println("four-arg constructor called");
	}

	public static void main(String[] args) {
		PracticeQuestion5 p = new PracticeQuestion5();
		p.show();

	}

	void show() {
		System.out.println("Book Name    :" + " " + bookName);
		System.out.println("Author Name  :" + " " + authorName);
		System.out.println("Price        :" + " " + price);
		System.out.println("Released Date:" + " " + releasedDate);
	}

}
