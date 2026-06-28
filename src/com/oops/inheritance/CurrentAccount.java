package com.oops.inheritance;

public class CurrentAccount extends Account{
	@Override
	double getInterestRate() {
		return 0.0;
	}
	void showCurrentAccountBenefits() {
		System.out.println("Current Account Bnefits");
		System.out.println("Unlimited Transactions");
		System.out.println("Interest Rate :"+getInterestRate()+"%");
	}

	public static void main(String[] args) {
		CurrentAccount c1=new CurrentAccount();
		System.out.println("CURRENT ACCOUNT");
		c1.customerDetail();
		c1.selectChoice();
		c1.showCurrentAccountBenefits();
		

	}

}
