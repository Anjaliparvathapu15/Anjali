package com.javaintro;

public class Test {
	{
		System.out.println("instance block");
	}
	Test(){
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		new Test();
	}

}
