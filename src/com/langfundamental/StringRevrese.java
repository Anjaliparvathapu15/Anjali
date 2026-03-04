package com.langfundamental;

public class StringRevrese {

	public static void main(String[] args) {

		rev("anjali");
	}

	static void rev(String s) {
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			r = s.charAt(i) + r;
		}
		System.out.println(r);
	}

}
