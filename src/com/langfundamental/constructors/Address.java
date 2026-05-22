package com.langfundamental.constructors;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {
    int id;
    Address addr;

    Student(int id, Address addr) {
        this.id = id;
        this.addr = addr;
    }

    Student(Student s) {
        id = s.id;
        addr = s.addr;
    }

    public static void main(String[] args) {

        Address a1 = new Address("Hyderabad");

        Student s1 = new Student(1, a1);

        Student s2 = new Student(s1);

        s1.addr.city = "Delhi";

        System.out.println(s1.addr.city);

        System.out.println(s2.addr.city);
    }
}