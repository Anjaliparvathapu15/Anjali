package com.gutquestions;
import java.util.Scanner;
import java.util.Stack;
public class DecodeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Encoded string :");
		String s=sc.next();
		System.out.println(decode(s));
		sc.close();
	}
	 static String decode(String s) {
		 Stack<Integer>countStack=new Stack<>();
		 Stack<String>stringStack=new Stack<>();
		 int number=0;
		 String current="";
		 for(char ch:s.toCharArray()) {
			 if(Character.isDigit(ch)) {
				 number=number*10+(ch-'0');
			 }else if(ch=='[') {
				 countStack.push(number);
				 stringStack.push(current);
				 number=0;
				 current="";
			 }else if(ch==']') {
				 int count=countStack.pop();
				 StringBuilder temp=new StringBuilder(stringStack.pop());
				 for(int i=0;i<count;i++) {
					 temp.append(current);
				 }
				 current=temp.toString();
			 }else {
				 current+=ch;
			 }
			 
		 }
		return current;
	}

}
