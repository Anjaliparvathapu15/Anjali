package com.loopingstatements;

class ReverseNum {
	void reverseNum() {
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
}

public class NaturalNumbers {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		ReverseNum r = new ReverseNum();
		r.reverseNum();
	}

}
