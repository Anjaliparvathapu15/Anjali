package com.oops.inheritance;

public class FixedDepositeAccount extends Account {
	@Override
	double getInterestRate() {
		return 7.0;
	}

	void showFDDetails() {
		System.out.println("Fixed Deposit Account");
		System.out.println("Interest Rate :" + getInterestRate() + "%");
	}

	public static void main(String[] args) {
		FixedDepositeAccount f1 = new FixedDepositeAccount();
		System.out.println("FIXED DEPOSIT ACCOUNT");
		f1.customerDetail();
		f1.selectChoice();
		f1.showFDDetails();
	}
}
