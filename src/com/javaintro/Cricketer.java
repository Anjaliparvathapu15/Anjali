package com.javaintro;

public class Cricketer {
	
    //declaration
	//instance variables
	//when object is created the instance data is stored in HEAP AREA
	
	int jerseyNo;
	String name;
	
	//static variables
	//static data will be loading when the class is loaded
	//static data stored in Method Area
	static int countryId;
	static String countryName;

	public static void main(String[] args) {
		System.out.println("main method is started");
		System.out.println("Welcome to Indian Cricket team !!!");
		
		System.out.println("Object 1");
		//creating an object
		Cricketer dh = new Cricketer();
		
		//initializing or assigning the data
		countryId=91;
		countryName="INDIA";
		dh.jerseyNo=7;
		dh.name="Dhoni";
		
		//Accessing the static variables
		System.out.println("Country ID :"+countryId);//0
		System.out.println("Country Name :"+countryName);//NULL
		
		//Accessing the instance variables by using object reference variables
		System.out.println("jersey Number :"+dh.jerseyNo);//0
		System.out.println("Name :"+dh.name);//NULL
		
		System.out.println("Object 2");
		Cricketer vk = new Cricketer();
		vk.jerseyNo=18;
		vk.name="Virat Kohli";
		//Accessing the static variables
		System.out.println("Country ID :"+countryId);//0
		System.out.println("Country Name :"+countryName);//NULL
				
		//Accessing the instance variables by using object reference variables
		System.out.println("jersey Number :"+vk.jerseyNo);//0
		System.out.println("Name :"+vk.name);//NULL
		
		System.out.println("Object 3");
		Cricketer rh = new Cricketer();
		rh.jerseyNo=45;
		rh.name="Rohit Sharma";
		//Accessing the static variables
		System.out.println("Country ID :"+countryId);//0
		System.out.println("Country Name :"+countryName);//NULL
				
		//Accessing the instance variables by using object reference variables
		System.out.println("jersey Number :"+rh.jerseyNo);//0
		System.out.println("Name :"+rh.name);//NULL
		
		System.out.println("Object 4");
		Cricketer jaddu = new Cricketer();
		countryId=92;
		countryName="Bharath";
		jaddu.jerseyNo=8;
		jaddu.name="Ravindra Jadeja";
		//Accessing the static variables
		System.out.println("Country ID :"+countryId);//0
		System.out.println("Country Name :"+countryName);//NULL
				
		//Accessing the instance variables by using object reference variables
		System.out.println("jersey Number :"+jaddu.jerseyNo);//0
		System.out.println("Name :"+jaddu.name);//NULL
		
		System.out.println("Object 5");
		Cricketer kl = new Cricketer();
		kl.jerseyNo=1;
		kl.name="kl rahul";
		//Accessing the static variables
		System.out.println("Country ID :"+countryId);//0
		System.out.println("Country Name :"+countryName);//NULL
				
		//Accessing the instance variables by using object reference variables
		System.out.println("jersey Number :"+kl.jerseyNo);//0
		System.out.println("Name :"+kl.name);//NULL
		
				

	}

}
