package com.stringhandling;
final class demo{
	final String m1;
	public demo(String s1) {
		this.m1=s1;
	}
	public String getterm1() {
		return m1;
	}
}
public class Test1 {
	public static void main(String[] args) {
		String s1=null;
		String s2="Java"+" is simple";
		System.out.println(s2=="Java is simple");
		System.out.println(s1+s2);
		demo d=new demo("java");
//		System.out.println(d.getterm1());
		System.out.println(s1);//NPE
		System.out.println(s1.concat(s2));
	}

}
