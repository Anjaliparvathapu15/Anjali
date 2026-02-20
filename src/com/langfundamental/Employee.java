package com.langfundamental;

public class Employee {
	static int empid = 101;
	static String empName = "Anjali";
	static double salary = 20000;
	{
		double bonus = salary * 0.1;
		salary = salary + bonus;
		System.out.println("empid=" + empid);
		System.out.println("empName=" + empName);
		System.out.println("total=" + salary);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();

	}

}
