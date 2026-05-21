package com.loopingstatements;

import java.math.BigInteger;

public class ProductOfNumbers {
//only up to integer range
	public static void main(String[] args) {
		BigInteger b = new BigInteger("1");
		for (int i = 1; i <= 20; i++) {
			BigInteger b1 = new BigInteger(String.valueOf(i));
			b = b.multiply(b1);

		}
		System.out.println(b);
	}

}
