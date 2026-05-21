package com.operators;

public class TernaryOp2 {

	public static void main(String[] args) {
		int x=80;
		int y=50;
		int z=40;
		int max=(x>y)?(x>z?x:z):(y>z?y:z);
		System.out.println(max);

	}

}
