package com.operators;

public class PracticeShiftOp1 {

	public static void main(String[] args) {
		int x = 3;
		System.out.println(x << 2 + 1);
		int a = 8;
		int b = 2;
		int c = a >> b << 1;
		System.out.println(c);
		System.out.println(1 << 2 << 3);
		int t = 5;
		int t1 = (t > 3) ? t++ : ++t;
		System.out.println(t + "  " + t1);

	}

}
