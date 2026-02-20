package com.javaintro;

public class MathUtils {
	static int a=5;
	static int b=5;
	static void add() {
		System.out.println("addition of A and B="+(a+b));
	}
	static void sub() {
		System.out.println("subtraction of A and B="+(a-b));
	}
	static void mul() {
		System.out.println("Multiplication of a and b="+(a*b));
	}
	//division pending
	public static void main(String[] args) {
		add();
		sub();
		mul();

	}

}
