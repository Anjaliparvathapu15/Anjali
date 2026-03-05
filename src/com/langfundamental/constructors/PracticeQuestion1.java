package com.langfundamental.constructors;

public class PracticeQuestion1 {
	
	static int x = 10;
	int y;
	PracticeQuestion1 (){
		y=10;
	}
	public static void main(String[] args) {
		PracticeQuestion1 p=new PracticeQuestion1();
		int z=p.y+10;
		System.out.println(z);
		x = x + 10;
		System.out.println(x);
		show(x);
		int inc=disply(x);
		System.out.println(inc);
		
	}
	static void show(int x) {
		x++;
		System.out.println(x);
	}
	static int disply(int x) {
		return x++;
	}
	

}
