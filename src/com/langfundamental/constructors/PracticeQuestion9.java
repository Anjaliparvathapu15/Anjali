package com.langfundamental.constructors;

public class PracticeQuestion9 {
	static int x;

	PracticeQuestion9() {
		x=0;
		if(x==10) {
		PracticeQuestion9 p=new PracticeQuestion9();
	}
		//this(1);
		// super();

		// this(1,"anjali");
		System.out.println("end");
	}

	public PracticeQuestion9(int id) {

	}

	PracticeQuestion9(int id, String name) {

	}

	public static void main(String[] args) {
		PracticeQuestion9 p = new PracticeQuestion9();

	}

}
