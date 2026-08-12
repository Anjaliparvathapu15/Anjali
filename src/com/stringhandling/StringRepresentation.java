package com.stringhandling;
import java.util.Stack;

public class StringRepresentation {
	public static void main(String[] args) {

        String s1 = "3[a]2[bc]";
        String s2 = "2[a3[cd]]";

        System.out.println(decode(s1)); 
        System.out.println(decode(s2)); 
    }

    public static String decode(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        
        String current = "";
        int number = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } 
            else if (ch == '[') {
            	    countStack.push(number);
                stringStack.push(current);
                number = 0;
                current = "";
            } 
            else if (ch == ']') {
                int count = countStack.pop();
                StringBuilder temp = new StringBuilder(stringStack.pop());

                for (int i = 0; i < count; i++) {
                    temp.append(current);
                }

                current = temp.toString();
            } 
            else {
                current += ch;
            }
        }

        return current;
    }

    
}