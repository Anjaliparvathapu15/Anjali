package com.loopingstatements;

class PrimeNumberUsingSQT {
	void prime() {
		for (int n = 2; n <= 100 - 1; n++) {
			int i;
			for (i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					break;
				}
			}
			if (i > Math.sqrt(n)) {
				System.out.print(n + " ");
			}
		}
	}
}

public class PrimeNumbersPrinting1 {

	public static void main(String[] args) {
		for (int n = 2; n <= 100 - 1; n++) {
			int i;
			for (i = 2; i < n; i++) {
				if (n % i == 0) {
					break;
				}
			}
			if (i == n) {
				System.out.print(i + " ");
			}
		}
		PrimeNumberUsingSQT p = new PrimeNumberUsingSQT();
		System.out.println(" ");
		p.prime();
	}

}
