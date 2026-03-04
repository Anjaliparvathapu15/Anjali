package com.langfundamental;

public class PracticeQuestion {
	
	static int x = 10;
	int y;
	PracticeQuestion (){
		y=10;
	}
	public static void main(String[] args) {
		PracticeQuestion p=new PracticeQuestion();
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
