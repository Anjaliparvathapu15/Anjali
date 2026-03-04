package com.langfundamental;

public class StudentMarks {
	String sName;
	double engMarks;
	double socMarks;
	double sciMarks;
	String brach;
	static double totalMarks;
	static double avergeMarks;

	StudentMarks(String sName, double engMarks, double socMarks, double sciMarks, String brach) {
		this.sName = sName;
		this.engMarks = engMarks;
		this.socMarks = socMarks;
		this.sciMarks = sciMarks;
		this.brach = brach;
		totalMarks = engMarks + socMarks + sciMarks;
		// System.out.println("total Marks of "+sName+" "+totalMarks);
		//avg=sum of observation/no.of observation
		avergeMarks = totalMarks / 3;
		// System.out.println("Average Marks of "+sName+" "+avergeMarks);
	}

	public static void main(String[] args) {
		StudentMarks s1 = new StudentMarks("Anjali", 100, 99, 99, "Cse");
		s1.disply();
		StudentMarks s2 = new StudentMarks("Teja", 100, 100, 99, "Cse");
		s2.disply();
		StudentMarks s3 = new StudentMarks("Vinay", 100, 100, 100, "Cse");
		s3.disply();

	}

	void disply() {
		System.out.println("total Marks of " + sName + ": " + totalMarks);
		System.out.println("Average Marks of " + sName + ": " + avergeMarks);
	}

}
