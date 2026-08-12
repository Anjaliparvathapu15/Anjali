package com.stringhandling;

public class PrintNumberOfTime {

	public static void main(String[] args) {
		String str="a3b2c4";
		String result="";
		for(int i=0;i<str.length();i=i+2) {
			char c=str.charAt(i);
			int count=str.charAt(i+1)-'0';
			for(int j=0;j<count;j++) {
				result=result+c;
			}
		}
		System.out.println(result);

	}

}
