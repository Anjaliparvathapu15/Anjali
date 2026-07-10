package com.exceptionhandling;

public class Test3 {

	public static void main(String[] args) {
		try {
		System.out.println(10/0);
		}catch(Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
			System.err.println(e.toString());

		}
	}

}
