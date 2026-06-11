package com.oops.inheritance;
class Student implements Cloneable{
	int id;
	String name;
	Address address;
	public Student(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
class Address{
	String city;
	public Address(String city) {
		this.city=city;
	}
}

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main Method started");
		Address a1=new Address("Hyderabad");
		Student s1=new Student(101,"Anjali",a1);
		Student s2=(Student)s1.clone();
		System.out.println("****************************");
		System.out.println("Student id     :"+s1.id);
		System.out.println("Student name   :"+s1.name);
		System.out.println("Student Address:"+s1.address.city);
		System.out.println("****************************");
		System.out.println("Student id     :"+s2.id);
		System.out.println("Student name   :"+s2.name);
		System.out.println("Student Address:"+s2.address.city);
		s2.name="Srikanth";
		s2.address.city="Tamilnadu";
		System.out.println("****************************");
		System.out.println("Student id     :"+s1.id);
		System.out.println("Student name   :"+s1.name);
		System.out.println("Student Address:"+s1.address.city);
		System.out.println("****************************");
		System.out.println("Student id     :"+s2.id);
		System.out.println("Student name   :"+s2.name);
		System.out.println("Student Address:"+s2.address.city);


	}

}
