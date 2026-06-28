package com.oops.inheritance;

public class SavingAccount extends Account{
	@Override
	double getInterestRate(){
		return 4.0;
	}
	void showSavingBenefits() {
		System.out.println("Saving Account Bnefits");
		System.out.println("Interest Rate :"+getInterestRate()+"%");
	}
	

	public static void main(String[] args) {
		SavingAccount s1=new SavingAccount();
		System.out.println("SAVING ACCOUNT");
		s1.customerDetail();
		s1.selectChoice();
		s1.showSavingBenefits();
		

	}

}
