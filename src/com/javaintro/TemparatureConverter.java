package com.javaintro;

public class TemparatureConverter {
	double celsius;
	double farenheit;
	public static void main(String[] args) {
		TemparatureConverter t1=new TemparatureConverter();
		TemparatureConverter t2=new TemparatureConverter();
		t1.celsius=30;
		t2.farenheit=86;
		t1.farenheit();
		t2.celsius();
		
	}
	 void farenheit() {
		double farenheit=((celsius*9/5)+32);
		System.out.println(farenheit);	
	}

	 void celsius() {
		double celsius=((farenheit-32)*5/9);
		System.out.println(celsius);
		
	}

}
