package com.langfundamental.constructors;

public class ConstructorExample {

	ConstructorExample() {
		System.out.println("Constructor ");
	}

	public static void main(String[] args) {
		new ConstructorExample();
		new ConstructorExample();

	}

	{
		System.out.println("instance block");
	}

}
