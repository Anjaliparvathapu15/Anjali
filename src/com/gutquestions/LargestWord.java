package com.gutquestions;

public class LargestWord {
	public static void main(String[] args) {
		String str="In Vcube, Java is Simple";
		String currentWord="";
		int currentLength=0;
		String largestWord="";
		int maxLength=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') {
				currentWord=currentWord+ch;
				currentLength++;
			}else {
				if(currentLength>maxLength){
			
				maxLength=currentLength;
				largestWord=currentWord;
				
				}
				currentWord="";
				currentLength=0;
			}
			if(currentLength>maxLength) {
				largestWord=currentWord;
			}
		}
		System.out.println(largestWord);
		
	}

}
