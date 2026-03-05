package com.langfundamental.constructors;

public class PracticeQuestion8 {
	PracticeQuestion8() {
		PracticeQuestion8 p = new PracticeQuestion8(1);
		System.out.println("no-arg");
	}

	PracticeQuestion8(int x) {
		System.out.println("para");
		System.out.println(x);
	}

	public static void main(String[] args) {
		PracticeQuestion8 p = new PracticeQuestion8();
		// PracticeQuestion8 p=new PracticeQuestion8();

	}

}
