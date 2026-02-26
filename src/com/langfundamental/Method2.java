package com.langfundamental;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		Method2 m2 = new Method2();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value:");
		int j = sc.nextInt();
		System.out.println("enter b value:");
		int k = sc.nextInt();
		System.out.println("enter name:");
		sc.nextLine();
		String a = sc.nextLine();
		System.out.println("enter the gender:");
		// method chaining
		// charAt(int index)
		char gen = sc.next().charAt(0);
		System.out.println("enter the salary:");
		double salary=sc.nextDouble();
		System.out.println("enter the bonus:");
		double bonus=sc.nextDouble();
		System.out.println("total salary of employee:"+(salary+bonus));
		System.out.println("total salary of employee:"+(m2.getEmployeeSalary(salary)+m2.getEmployeeBonus(bonus)));
		//System.out.println(m2.add(j,k));
		//The method println(boolean) in the type PrintStream is not applicable for the arguments (void)
		m2.getEmployeeSalary(salary);
		m2.getEmployeeBonus(bonus);
		m2.getName(a);
		m2.add(j, k);
		m2.getGender(gen);
		sc.close();
	}

	void add(int a, int b) {
		int add = a + b;
		System.out.println("addition :" + add);
	}

	void getName(String Name) {
		System.out.println("User name:" + Name);
	}

	void getGender(char gender) {
		System.out.println("Gender is:" + gender);
	}

	double getEmployeeSalary(double sal) {
		//System.out.println("Employee salary:" + sal);
		return sal;
	}
	double getEmployeeBonus(double bon) {
		//System.out.println("Employee salary:" + bon);
		return bon;
	}

}
