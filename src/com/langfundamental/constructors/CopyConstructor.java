package com.langfundamental.constructors;


public class CopyConstructor {
	String hero;
	String heronie;
	String director;
	double budget;
	String movieName;
	CopyConstructor(){
		System.out.println("no_arg");
	}
	CopyConstructor(String hero){
		System.out.println("parameterized constructor");
		this.hero=hero;
	}
	CopyConstructor(String heronie,String director){
		this.heronie=heronie;
		this.director=director;
		
	}
	CopyConstructor(CopyConstructor c2,double budget){
		this(c2.heronie,c2.director);
		this.budget=budget;
		
	}
	CopyConstructor(CopyConstructor c1,String movieName){
		this(c1,c1.budget);
		this.movieName=movieName;
		}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		CopyConstructor c=new CopyConstructor();
		c.show();
		CopyConstructor c1=new CopyConstructor("Mahesh Babu");
		c1.show();
		
		CopyConstructor c2=new CopyConstructor("Chopra","Dvv");
		c2.show();
		CopyConstructor c3=new CopyConstructor(c2,20900000.00);
		c3.show();
		CopyConstructor c4=new CopyConstructor(c3,"Varanasi");
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

