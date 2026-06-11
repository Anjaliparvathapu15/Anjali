package com.oops.inheritance;

class Employee {
    int id;

    Employee(int id) {
    	this.id=id;
    }

    @Override
    public boolean equals(Object obj) {
    	Employee s = (Employee) obj;
        return this.id == s.id;
    }
}
//.equals() method checks the values only for strings because by 
//default the equals()method is overriden in the String class

public class Main {
    public static void main(String[] args) {
    	Employee s1 = new Employee(101);
    	Employee s2 = new Employee(101);
    	String s="Anjali";
    	String b="Queen";
    	String c="Anjali";
        System.out.println(s1.equals(s2));
        System.out.println(s.equals(b));
        System.out.println(s.equals(c));
    }
}