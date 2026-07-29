package com.collections;

import java.util.Stack;

public class TestStack1 {

	public static void main(String[] args) {
		Stack <Integer> s1=new Stack<>();
//		s1.add(101);
		s1.push(101);
		s1.push(11);
		s1.push(19);
		s1.add(188);
		
		System.out.println(s1);
		s1.pop();//returns and removes the top of the element from the stack.(Object is the return type)
		System.out.println(s1);
		System.out.println(s1.peek());//object is the return type.
		System.out.println(s1.search(22));//expects an object and returns 1-based position of the element
		//if element not found return -1
		System.out.println(s1.empty());//boolean is the return type.
	}

}
