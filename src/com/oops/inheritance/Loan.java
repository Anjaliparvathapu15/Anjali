package com.oops.inheritance;

import java.util.Scanner;

public class Loan {
static Scanner sc= new Scanner(System.in);
	
	boolean isValidAaddar() {
		System.out.println("Enter your Aadhar :");
		String aadhar=sc.next();
		return aadhar.matches("\\d{12}");
	}
	boolean isValidPan() {
		System.out.println("Enter your Pan : ");
		String pan=sc.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
	}
	boolean isValidPhone() {
		System.out.println("Enter your Phone :");
		String phone=sc.next();
		return phone.matches("[6-9]\\d{9}");
	}
	double getCustomerSalary(){
		System.out.println("Enter your Salary :");
		double salary=sc.nextInt();
		return salary;
	}
	int getCustomerAge() {
		System.out.println("Enter your Age :");
		int age=sc.nextInt();
		return age;
	}
	int getCibilScore() {
		System.out.println("Enter your Cibil Score :");
		int cibilScore=sc.nextInt();
		return cibilScore;
	}
	String getCustomerAddress() {
		String address=null;
		System.out.println("Enter your Flat number :");
		String fno=sc.next();
		System.out.println("Enter your Plot number :");
		String plotNo=sc.next();
		System.out.println("Enter your Street name :");
		sc.nextLine();
		String street=sc.nextLine();
		System.out.println("Enter your City name :");
		String city=sc.next();
		System.out.println("Enter your PINCODE :");
		String pincode=sc.next();
		address="Flat NO :"+fno
				+", Plot NO :"+plotNo
				+", Street name :"+street
				+", City name :"+city
				+", PINCODE :"+pincode;
		return address;
		
	}
	 double getROI(){
		double roi= 12.5;
		int cibilScore=getCibilScore();
		if(cibilScore>=300 && cibilScore<=599) {
			System.out.println("Bad !High risk Loan Application may reject fequently!! ");
			roi=11.0;
		}
		else if(cibilScore>=600 && cibilScore<=699) {
			System.out.println("Average! Approvals are possible ,but with High Interest ");
			roi=10.5;
			
		}
		else if(cibilScore>=700 && cibilScore<=749) {
			System.out.println("Good !Favorable for most of the Loans and for Creadit cards");
			roi=9.0;
		}
		else if(cibilScore>=750 && cibilScore<=900) {
			System.out.println("Best Cibil Score ! More Favorable for Loans and Credit cards");
		}
		return roi;
		
	}

}
