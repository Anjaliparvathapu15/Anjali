package com.langfundamental;

public class Operations {
	static double a=4;
	static double b=20;
	static void add() {
		double sum=(a+b);
		System.out.println("sum is="+sum);
	}
	static void sub() {
		 double sub=(a-b);
		System.out.println("difference is="+sub);
	}
	static void mul()
	{
		double mul=a*b;
		System.out.println("Product is="+mul);

	}
	static void div() {
		double div=a/b;
		System.out.println("quoient is="+div);

	}
	static void mod() {
		double mod=a%b;
		System.out.println("remainder is="+mod);

	}


	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();

	}

}
