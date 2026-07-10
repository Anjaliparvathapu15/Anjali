package com.exceptionhandling;

public class Test1 {
	

	public static void main(String[] args) {
		try {
			int a=10/0;
		}catch(Exception e) {
			throw new NullPointerException();
		}
//		catch(Exception e1) {
//			System.out.println("Exception");
//		}

	}

}
