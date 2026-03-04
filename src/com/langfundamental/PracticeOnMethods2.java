package com.langfundamental;

public class PracticeOnMethods2 {
	int a = 10;
	int x = 100;

	class Parent {
		int sup() {
			return 10;
		}
	}

	class Child extends Parent {
		// we can't change return type in method overriding
		// double sup() {
		// return 10.0;
		// }
		int sup() {
			return 20;
		}
	}

	public static void main(String[] args) {
		PracticeOnMethods2 p = new PracticeOnMethods2();
		int s = 5;
		p.add(s);
		System.out.println(s);
		// 2
		System.out.println(p.check(10));
		System.out.println(p.check(11));
		// 3
		p.show(20);
		System.out.println(p.a);
		// 4
		int r1 = p.mul(2, p.add1(3, 4));
		// we can also pass same method as arguments to the method
		int r = p.mul(2, p.mul(3, 4));
		System.out.println(r1);
		System.out.println(r);
		// The method println(boolean) in the type PrintStream is not applicable for the
		// arguments (void)
		// System.out.println(p.show());
		System.out.println(p.anju() + p.anju());

		System.out.println(p.teja(50));
	}

	void add(int x) {
		x = x + 10;
		System.out.println(x);
	}

	int check(int c) {
		if (c > 10)
			return c;
		return c + 10;
	}

	void show(int a) {
		System.out.println(a);
	}

	int add1(int a, int b) {
		return a + b;
	}

	int mul(int x, int y) {
		return x * y;
	}

	int anju() {
		return 5;
	}

	int teja(int x) {
		return x + this.x;
	}

}
