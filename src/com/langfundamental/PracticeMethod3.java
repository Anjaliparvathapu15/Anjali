package com.langfundamental;

public class PracticeMethod3 {

	public static void main(String[] args) {
		PracticeMethod3 p1 = new PracticeMethod3();
		p1.display();
		p1.validate(19);
	}
//one process
	void display() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	//two process
	void display1() {
		int i=1;
		if(i<=10) {
			System.out.println(i);
		}
	}
	void validate(int age) {
	    if (age < 18)
	        return;   
	    System.out.println("Eligible");
	}
	
}
