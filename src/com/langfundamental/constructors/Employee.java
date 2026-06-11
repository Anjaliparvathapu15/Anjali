package com.langfundamental.constructors;


 class Company {
	String name;
	Company(String name){
	this.name=name;
	}
}
	class Manager extends Company{
		String mname;
		Manager(String name,String mname){
			super(name);
			this.mname=mname;
		}
	}	
	public class Employee extends Manager{
		int id;
		String ename;
		
		Employee(String name,String mname,int id,String ename){
			super(name,mname);
			this.id=id;
			this.ename=ename;
		}
	
	
	public static void main(String[] args) {
		Employee e=new Employee("Oracle","Anjali",1,"teja");
		e.details();
	}
	void details() {
		System.out.println(name);
		System.out.println(mname);
		System.out.println(id);
		System.out.println(ename);
	}
}
