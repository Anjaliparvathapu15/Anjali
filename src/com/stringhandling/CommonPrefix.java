package com.stringhandling;

public class CommonPrefix {

	public static void main(String[] args) {
		String[]arr={"flower","flow","flight"};
		String minString="";
		int minLength=Integer.MAX_VALUE;
		for(String s: arr) {
			if(s.length()<minLength) {
				minLength=s.length();
				minString=s;
			}
		}
		String commonPrefix="";
		int count=0;
		for(int j=0;j<minLength;j++) {
			boolean status=true;
			char c=minString.charAt(j);
			for(String s: arr) {
				if(s.charAt(j)!=c) {
					status=false;
					break;
				}
			}
			if(status) {
				commonPrefix+=c;
				count++;
				
			}else {
				break;
			}
			
		}
		System.out.println(commonPrefix);
		System.out.println(count);
	}

}
