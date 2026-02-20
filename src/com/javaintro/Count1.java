package com.javaintro;
 class Count1{
	static int a=0;
	public static void main(String[] args) {
		Method1();
		Method1();
		Method1();
		Method1();
		Method1();
		System.out.println(a);
	}
	static void Method1() {
		System.out.println("static method called");
		a++;
	}
}
