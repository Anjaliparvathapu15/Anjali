package com.langfundamental.constructors;

public class CpyConstructors {
	String hero;
	String heronie;
	String director;
	double budget;
	String movieName;
	CpyConstructors(){
		System.out.println("no_arg");
	}
	CpyConstructors(String hero){
		System.out.println("parameterized constructor");
		this.hero=hero;
	}
	CpyConstructors(String heronie,String director){
		this.heronie=heronie;
		this.director=director;
		
	}
	CpyConstructors(CpyConstructors c,double budget){
		this.budget=budget;
		this.heronie=c.heronie;
		this.director=c.director;
	}
	CpyConstructors(CpyConstructors c1,String movieName){
		this.heronie=c1.heronie;
		this.director=c1.director;
		this.budget=c1.budget;
		this.movieName=movieName;
		}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		CpyConstructors c=new CpyConstructors();
		c.show();
		CpyConstructors c1=new CpyConstructors("Mahesh Babu");
		c1.show();
		
		CpyConstructors c2=new CpyConstructors("Chopra","Dvv");
		c2.show();
		CpyConstructors c3=new CpyConstructors(c2,20900000.00);
		c3.show();
		CpyConstructors c4=new CpyConstructors(c3,"Varanasi");
		c4.show();
	}
	void show() {
		System.out.println(hero);
		System.out.println(heronie);
		System.out.println(director);
		System.out.println(budget);
		System.out.println(movieName);
		System.out.println("********************");
	}

}
