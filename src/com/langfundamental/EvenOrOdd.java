package com.langfundamental;

//import java.util.Scanner;

public class EvenOrOdd {

	void main(String[] args) {
		Parent p=new Parent();
		Parent p1=new Child();
		System.out.println(p.show());
		System.out.println(p1.show());
		System.out.println(max(2,7));
	}
	class Parent{
		Number show() {
			return 10;
		}
	}
	class Child extends Parent{
		Integer show() {
			return 20;
		}
	}
	int max(int a, int b) {
		
		return (a>b) ? a:b;
	}

}
