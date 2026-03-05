package com.langfundamental.constructors;

public class Example2 {
	int a;
	static int b;
	{
		a = 20;
	}
	{
		a = 30;
	}
	static {
		b = 10;
	}

	Example2() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {

		Example2 e1 = new Example2();

		Example2 e2 = new Example2();

	}

}
