package com.consolebasedapps;

import java.util.Scanner;

public class NaukariPortal {

	public static void main(String[] args) {
		System.out.println("Welcome to IT industry");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enetr your name :");
		String name = sc.next();
		System.out.println("Hello " + name);
		System.out.println("Enetr your Education Qualification :");
		System.out.println("B.Tech");
		System.out.println("B.Com");
		System.out.println("B.Sc");
		System.out.println("MBA");
		System.out.println("MCA");
		String qualification = sc.next();
		if (qualification.equalsIgnoreCase("B.Tech")) {
			System.out.println("Great!you are eligible to proceed");
			System.out.println("Great!How many years of experience do you have ?");
			int experience = sc.nextInt();
			if (experience >= 1) {
				System.out.println("Great we can carry on");
				System.out.println("What your current salary?");
				double salary = sc.nextDouble();
				System.out.println("How much salary you are expecting ?");
				double expectingSalary = sc.nextDouble();
				if (expectingSalary > 5000000 && expectingSalary <= 8000000) {
					System.out.println("Ohh Okay We can Proceed");
					System.out.println("Which technology are you skilled in ");
					System.out.println("JAVA");
					System.out.println("PYTHON");
					System.out.println("DEVOPS");
					System.out.println("DATA SCIENCE");
					String skillKnown = sc.next();
					if (skillKnown.equalsIgnoreCase("JAVA")) {
						System.out.println("Great!we can proceed");
						System.out.println("Do you know MySQL");
						String known = sc.next();
						if (known.equalsIgnoreCase("YES")) {
							System.out.println("Great!you are eligible to proceed");
							System.out.println("What is your UG percentage ?");
							int percentage = sc.nextInt();
							if (percentage >= 70) {
								System.out.println("Excellent!your are eligible for next round ");
								System.out.println("Are you willing to relocate");
								String relocate = sc.next();
								if (relocate.equalsIgnoreCase("YES")) {
									System.out.println("Yes we can continue");
									System.out.println("Do you have all education documents?");
									String documents = sc.next();
									if (documents.equalsIgnoreCase("YES")) {
										System.out.println("Ohh Good to continue");
										System.out.println(
												"Great!your profile is perfectly matching with our job description");
										System.out.println("HR team will be contact you soon");
									} else {
										System.out.println("Sorry!you may leave");
									}
								} else {
									System.out.println("Sorry!you can leave for today");
								}
							} else {
								System.out.println("We are looking for more than 70% academic score");
							}
						} else {
							System.out.println("You can leave for the day");
						}
					} else {
						System.out.println(" Your salary expectation is too high ");
					}
				} else {
					System.out.println("You can leave for the day");
				}
			} else {
				System.out.println("Sorry!Currently we are looking for candidates with atleast 1 year experience");
			}

		} else {
			System.out.println("Sorry your education details are not matching with our profile");
		}
		sc.close();
	}

}
