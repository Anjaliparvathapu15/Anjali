package com.stringhandling;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer();
		System.out.println(s.capacity());//intial capacity is 16
		StringBuffer s1=new StringBuffer();
		System.out.println(s1.capacity());//16+the length of given string
		s1.append("seeeeeeeeeeeeeeee");//34(16*2+2)
		s1.append("seeeeeeeeeeeeeeeee");//70(34*2+2);
		System.out.println(s1.capacity());
		StringBuffer sb = new StringBuffer("Javaaaaaaaaaaaaaaaa");//17,18,19,20

		System.out.println(sb.length());    // 4
		System.out.println(sb.capacity());  // 20

	}

}
