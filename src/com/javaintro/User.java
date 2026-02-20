package com.javaintro;

public class User {
	static String username="Anjali";
	static long phoneNumber=9502788459L;
	static int balance=2000;
	static int accountNo=123450;
	 {
		System.out.println("USER NAME:"+username);
		System.out.println("PHONE:"+phoneNumber);
		System.out.println("BALANCE:"+balance);
		System.out.println("ACCOUNTNO:"+accountNo);
		accountNo++;
	}

	public static void main(String[] args) {
		User u1=new User();
		User u2=new User();
		User u3=new User();
		User u4=new User();
	}

}
