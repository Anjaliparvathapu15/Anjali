package com.stringhandling;

public class SubSequence {

    public static void printSubsequence(String str, String ans, int index) {
        if (index == str.length()) {
            System.out.println(ans);
            return;
        }
        printSubsequence(str, ans + str.charAt(index), index + 1);
        printSubsequence(str, ans, index + 1);
    }
    public static void main(String[] args) {
        String str = "ABC";
        printSubsequence(str, "", 0);
    }
}