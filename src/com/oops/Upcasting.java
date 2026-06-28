package com.oops;
class Student{
	void m1() {
		System.out.println("Parent");

	}
}
class Anjali extends Student{
	@Override
	void m1() {
		System.out.println("Child");
	}
}
public class Upcasting {

	public static void main(String[] args) {
		Student a=new Anjali();
		a.m1();

	}

}
