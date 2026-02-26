package com.langfundamental;

public class Testmethods1 {

	public static void main(String[] args) {
		Testmethods1 t1=new Testmethods1();
		t1.Method1(10,20);
		int m1=t1.Method3(40,40);
		System.out.println(m1);
		int m2=t1.Method4(60,m1);
		System.out.println(m2);
	}
	void Method1(int a,int b) {
		int sum=a+b;
		System.out.println("sum is:"+sum);
		Method2(90,sum);
	}
	void Method2(int a,int b) {
		int sub=a-b;
		System.out.println("sub is:"+sub);
	}
	int Method3(int i,int j) {
		int sum=i+j;
		return sum;
	}
	int Method4(int t,int v) {
		int sum=t+v;
		return sum;
	}
	
}
