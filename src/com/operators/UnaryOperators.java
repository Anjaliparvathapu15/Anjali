package com.operators;

public class UnaryOperators {

	static int x;
	public static void main(String[] args) {
		int result=x++ + ++x - ++x + --x -x-- +x++ + ++x;
		System.out.println(result);

	}

}
