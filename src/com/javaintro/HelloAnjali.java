package com.javaintro;

public class HelloAnjali {

	public static void main(String[] args) throws ClassNotFoundException //if class not fund throws error 
	{
		Class.forName("java.lang.String");//this is for checking whether the class in loaded successfully or not
		System.out.println("loading the String");
		System.out.println(Class.forName("com.javaintro.Cricketer"));
		System.out.println("loading the driver");
		
		Class.forName("com.mysql.cj.jdbc.Driver");//this will checks in application class loader
		System.out.println("hello world");
   
	}
	//the forName will returns the class space fully qualified name as output
	// if class is not loaded then it will throws an error ClassNotFound Exception 

}
