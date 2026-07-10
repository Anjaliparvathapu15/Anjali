package com.exceptionhandling;

public class Test {
	static int test() {
		try {
			throw new Exception();
		} catch (Exception e) {
			return 20;
		}
		finally {
			System.out.println("Finally");
		}
	}

	public static void main(String[] args) {
		System.out.println(test());

	}

}
