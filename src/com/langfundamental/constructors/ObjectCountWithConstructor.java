package com.langfundamental.constructors;

public class ObjectCountWithConstructor {
	static int count = 0;

	ObjectCountWithConstructor() {
		count++;
		System.out.println("Object number:" + count);
	}

	public static void main(String[] args) {
		ObjectCountWithConstructor c1 = new ObjectCountWithConstructor();
		ObjectCountWithConstructor c2 = new ObjectCountWithConstructor();
		ObjectCountWithConstructor c3 = new ObjectCountWithConstructor();
		show();
	}

	static void show() {
		System.out.println("total No.Of Objects:" + count);
	}

}
