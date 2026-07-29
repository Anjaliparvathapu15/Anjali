package com.gutquestions;

public class StringReverse {

	public static void main(String[] args) {
		String str="Java full stack";
		String reverse="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				reverse=reverse+ch;
			}
			else if(ch!=' ') {
				reverse=ch+reverse;
			}
		}
		System.out.println(reverse);

	}

}
