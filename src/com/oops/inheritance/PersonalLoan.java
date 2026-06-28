package com.oops.inheritance;


public class PersonalLoan extends Loan{
	@Override
	public double getROI(){
		return 8.5;
	}
	
	static  void getPersonalLoanDocInfo() {
		 System.out.println("Submitted all the documents successfully!!");
	 }
	public static void main(String[] args) {
		System.out.println("Welcome to SBH  Personal Loan Banking !!");
		//Scenario:By using child object or child reference ,we can call both
		//Parent class functionalities as well as child class functionalities
		LoanInterface p1=new PersonalLoan();
		//Loan p=new PersonalLoan();
		//p.hello();
		//p.getPersonalLoanDocInfo();
		//Loan l=new Loan();
		//l.getPersonalLoanDocInfo();
		int cibilScore=p1.getCibilScore();
		double salary=p1.getCustomerSalary();
		int age=p1.getCustomerAge();
		
		if(cibilScore>760&&salary>1000000.00&&age>25 
				&&p1.isValidAaddar()&&p1.isValidPan()&&p1.isValidPhone()) {
			System.out.println("Congratulations !! Your Loan got approved");
			System.out.println("Your Personal Loan ROI is :"+p1.getROI());
			System.out.println("Your Address Details : ");
			System.out.println(p1.getCustomerAddress());
			getPersonalLoanDocInfo();
			
		}
		else {
			System.out.println("Sorry !! Your Personal Loan got Rejected");
		}
		

	}

}
