package com.javaintro;

public class Demo {
	int a=10;
	static int b=20;
	void show() {
		System.out.println(a);
		System.out.println(b);
	}
	static void display() {
		Demo d1=new Demo();
		System.out.println(d1.a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.show();
		display();
	}
}
