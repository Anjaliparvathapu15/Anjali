package com.langfundamental;

public class ElectricityBill {
	int unit = 120;
	double ratePerUnit = 6;
	static double gstPercentage = 5;
	static double gstAmount;
	//instance variables
	double basicbill;
	double totalBill;

	static void calculategst(double basicbill) {
		gstAmount = (basicbill * gstPercentage) / 100;
	}

	void generateElectricity() {
		//local variables can't access outside of the method 
		//if we want to access it outside of the method then we have to declare them as instance variables
		basicbill = unit * ratePerUnit;
		calculategst(basicbill);
		totalBill = basicbill + gstAmount;
		System.out.println(basicbill);
		System.out.println(totalBill);

	}

	public static void main(String[] args) {
		ElectricityBill b1 = new ElectricityBill();
		b1.generateElectricity();
		System.out.println(b1.unit);
		System.out.println(b1.ratePerUnit);
		System.out.println(gstPercentage);
		System.out.println(gstAmount);
		System.out.println(b1.basicbill);
		System.out.println(b1.totalBill);

	}

}
