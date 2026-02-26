package com.langfundamental;

public class Testcount {
	static int a = 6639;

	public static void main(String[] args) {
		System.out.println("no of 1000's:" + a / 1000);
		System.out.println("no of 100's:" + (a / 100) % 10);
		System.out.println("no of 10's:" + (a / 10) % 10);
		System.out.println("no of 1's:" + a % 10);
		method();
	}
	 static void method() {
		int a=6688;
		int two1000s=a/2000;
		a=a%2000;
		System.out.println(two1000s);
		int five100s=a/500;
		System.out.println(five100s);
		a=a%500;
		int n200=a/200;
		a=a%200;
		System.out.println(n200);
		int n100=a/100;
		a=a%100;
		System.out.println(n100);
		int n50=a/50;
		a=a%50;
		System.out.println(n50);
		int n20=a/20;
		a=a%20;
		System.out.println(n20);
		int n10=a/10;
		a=a%10;
		System.out.println(n10);
		int n5=a/5;
		a=a%5;
		System.out.println(n5);
		int n2=a/2;
		a=a%2;
		System.out.println(n2);
		int n1=a/1;
		a=a%1;
		System.out.println(n1);
				
	}

}
