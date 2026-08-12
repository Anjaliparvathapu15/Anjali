package com.stringhandling;

public class Practice1 {

	public static void main(String[] args) {
		String str="aab2c4";
		System.out.println(str.codePointCount(0, 3));
		String str1="aAa";
		System.out.println(str.compareTo(str1));//return int
		System.out.println(str.compareToIgnoreCase(str1));
		String str3="";
//		String str4=null;
		System.out.println(str3.isEmpty());
//		System.out.println(str4.isEmpty());
		String str5=" ";
		System.out.println(str5.isEmpty());
		System.out.println(str5.isBlank());
		System.out.println(str3.isBlank());
		String s1=new String("JAVA");
		String s2="JAVA";
		s1=s1.intern();
		System.out.println(s1==s2);//true
		String s3="java isaaaasimple";
		System.out.println(s3.lastIndexOf('a',9));
		byte[]arr=s2.getBytes();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		String s=String.join("-","Java","is","simple");
		System.out.println(s);
		String ss="java is simple in vcube123456";
		String[] ss1=ss.split("\\s");
		for(String d:ss1) {
			System.out.println(d);
		}
		System.out.println(ss.replace("java", "JAVA"));
		System.out.println(ss.replace('a', 'A'));
		        String r = "      Java Java Python Java      ";
		        System.out.println(r.subSequence(0, 10));
		        String result = r.replaceFirst("Java", "C");

		        System.out.println(result);
		        System.out.println(r.trim());
		        System.out.println(r.replaceAll("\\s",""));
		        String m="9502788459";
		        System.out.println(m.matches("[6-9][0-9]{9}"));
		        int n=99;
		        String v=String.valueOf(n);
		    System.out.println(100+v);
		}		
	}


