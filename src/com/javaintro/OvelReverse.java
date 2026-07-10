package com.javaintro;

import java.io.IOException;

public class OvelReverse {

	public static void main(String[] args)throws IOException {
		
		System.out.println("A");
		
		
		
		
		
		String s1="education";
		int start=0;
		int end=s1.length();
		System.out.println(s1.charAt(0));
		for(int i=0;i<s1.length();i++) {
			while(start<end) {
				if(s1.charAt(start)=='a'||s1.charAt(start)=='e'||s1.charAt(start)=='i'||s1.charAt(start)=='o'||s1.charAt(start)=='u') {
					if(s1.charAt(end)=='a'||s1.charAt(end)=='e'||s1.charAt(end)=='i'||s1.charAt(end)=='o'||s1.charAt(end)=='u') {
						int temp=s1.charAt(start);
//						s1.charAt(start)=s1.charAt(end);
					}

				}
				
			}
		}

	}

}
