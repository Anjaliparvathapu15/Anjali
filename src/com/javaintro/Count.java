package com.javaintro;

public class Count {
	static int total=0;
	int number=0;
	void add() {
		total++;
		number++;
	}
	public static void main(String[] args) {
		Count c1=new Count();
		Count c2=new Count();
		c1.add();
		c2.add();
		//instance variables as its own copy 
		//static variables, shared among all objects of the class
		//each object number is incremented separately,but total will increase across all objects 
		System.out.println(c1.number+""+c2.number+""+total);
	}
}
