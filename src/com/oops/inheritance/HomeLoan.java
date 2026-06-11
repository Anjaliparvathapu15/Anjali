package com.oops.inheritance;

public class HomeLoan extends Loan {
	void getHomeLoanDocInfo() {
		System.out.println("All Documents Submitted Successfully");
	}
	@Override
	double getROI(){
		return 8.5;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to SBH  Personal Loan Banking !!");
		HomeLoan h1 = new HomeLoan();
		int cibilScore = h1.getCibilScore();
		double salary = h1.getCustomerSalary();
		int age = h1.getCustomerAge();

		if (cibilScore > 700 && salary > 600000.00 && age > 22 && h1.isValidAaddar() && h1.isValidPan()
				&& h1.isValidPhone()) {
			System.out.println("Congratulations !! Your Loan got approved");
			System.out.println("Your Home Loan ROI is :" + h1.getROI());
			System.out.println("Your Address Details : ");
			System.out.println(h1.getCustomerAddress());
			h1.getHomeLoanDocInfo();

		} else {
			System.out.println("Sorry !! Your Personal Loan got Rejected");
		}

	}

}
