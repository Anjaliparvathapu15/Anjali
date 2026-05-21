package com.langfundamental.constructors;

public class LoginValidations {
	String userName;
	String password;
	String email;

	LoginValidations() {
		this("guest", "Guest@123", "guest@gmail.com");

	}

	LoginValidations(String userName, String password) {
		this(userName, password, "anjali@gmail.com");

	}

	LoginValidations(String userName, String password, String email) {
		this.userName = userName;
		this.email = email;
		if (password.length() < 8) {
			this.password = "default__15";
		} else {
			this.password = password;
		}

	}

	public static void main(String[] args) {
		LoginValidations l1 = new LoginValidations("Teja", "Teja__18", "tejak0291@gmail.com");
		l1.display();
		LoginValidations l3 = new LoginValidations("Anjali", "Anjali_15");
		l3.display();
		LoginValidations l = new LoginValidations();
		l.display();
	}

	void display() {
		System.out.println("***********************");
		System.out.println("USERNAME :" + userName);
		System.out.println("PASSWORD :" + password);
		System.out.println("EMAIL ID :" + email);
	}

}
