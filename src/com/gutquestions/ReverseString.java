package com.gutquestions;

public class ReverseString {

	public static void main(String[] args) {
		String str="Java Full Stack";
		String word="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				word=word+ch;
			}else {
				for(int j=word.length()-1;j>=0;j--) {
					System.out.print(word.charAt(j));
				}
				System.out.print(" ");
				word="";
			}
			
		}
		for(int j=word.length()-1;j>=0;j--) {
			System.out.print(word.charAt(j));
		}

	}

}
