package com.langfundamental;

public class Datatypes {
	byte b = 127;
	byte b1 = (byte) 2147483647;
	short s = -32768;
	int i = 2147483647;
	long l = 223372036854775807L;
	float f = 112.66f;
	float f1 = 100;
	double d = 123.5555555d;
	float f2 = 1234566778890f;
	char c = 'a';
	char c1 = 70;//F
	char c2 = '5';
	// Invalid character constant char c3='10';
	char c3 = 65;
	char c4 = '\u0040';
	char c5 = '\u0065';
	int a = 'a';
	int a1 = 'A';
	int a2 = 'z';
	int a3 = 'Z';
	int a4='5';//ASCII Value=53
	boolean boo=true;
	

	void main(String[] args) {
		System.out.println(b);
		System.out.println(b1);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(f1);
		System.out.println(d);
		System.out.println(f2);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a1+1);//implicit type casting->char to int
		System.out.println((char)(a1+1));
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(!boo==false);

	}

}
