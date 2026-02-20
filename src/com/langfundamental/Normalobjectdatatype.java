package com.langfundamental;

import java.math.BigInteger;
import java.math.BigDecimal;

class Suma {

}

public class Normalobjectdatatype {
	// Normal object data types
	String s;
	String s1 = "Anjali";// String literal object->stores in Heap-->CREATE 1 Object
	String s2 = new String("Vcube");// String Object->stores in SCP-->CREATE 2 Objects
	String s3 = "Vcube";// 0 objects
	BigInteger b;
	BigDecimal d;
	// BigInteger b1=10; Type mismatch: cannot convert from int to BigInteger
	BigInteger b1 = new BigInteger("122344567890");
	BigInteger b2 = new BigInteger("122344567890");
	BigDecimal a1 = new BigDecimal("122344567890.000099999");

	// wrapper object data type
	Integer i;
	Character c;
	Boolean boo;
	// user defined object data type
	Suma sri;

	public static void main(String[] args) {
		Normalobjectdatatype d1 = new Normalobjectdatatype();
		System.out.println(d1.s);// null
		System.out.println(d1.b);// null
		System.out.println(d1.d);// null
		System.out.println(d1.i);// null
		System.out.println(d1.c);// null
		System.out.println(d1.boo);// null
		System.out.println(d1.sri);// null
		System.out.println(d1.s1);
		System.out.println(d1.s2);
		System.out.println(d1.s3);
		System.out.println(d1.b1);
		System.out.println(d1.b2);
		// System.out.println(d1.b1+d1.b2);The operator + is undefined for the argument
		// type(s) BigInteger, BigDecimal
		System.out.println(d1.b1.add(d1.b2));
		System.out.println(d1.a1);
		System.out.println(d1.a1.add(d1.a1));

	}

}
