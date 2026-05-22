package com.langfundamental.constructors;

class Address1 {
	String city;

	Address1(String city) {
		this.city = city;
	}
}

class Student1 {
	int id;
	Address1 addr;

	Student1(int id, Address1 addr) {
		this.id = id;
		this.addr = addr;
	}

	Student1(Student1 s) {
		id = s.id;
		addr = new Address1(s.addr.city);
	}

	public static void main(String[] args) {

		Address1 a1 = new Address1("Hyderabad");

		Student1 s1 = new Student1(1, a1);

		Student1 s2 = new Student1(s1);

		s1.addr.city = "Delhi";

		System.out.println(s1.addr.city);

		System.out.println(s2.addr.city);
	}
}