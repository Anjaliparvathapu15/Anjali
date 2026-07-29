package com.collections;

import java.util.ArrayList;
import java.util.List;

class Student{
	int sno;
	String sname;
	int age;
	public Student(int sno,String sname,int age) {
		this.sno=sno;
		this.sname=sname;
		this.age=age;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "[sno "+sno+", sname "+sname+", age "+age+" ]";
	}
}
public class ArrayListtest2 {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"Vinay",38);
		Student s2=new Student(2,"Teja",24);
		Student s3=new Student(3,"Anjali",21);
		Student s4=new Student(4,"Navya",22);
		List<Student>l1=new ArrayList<>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		System.out.println(l1);
		for(Student a:l1) {
			System.out.println(a);
		}

	}

}
