package com.consolebasedapps;

import java.util.Scanner;

public class RailwayReservation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String passengerName="";
		String gender="";
		int age=0;
		int trainChoice=0;
		int seatNo=1;
		double ticketPrice=0;
		
		int choice;
		String continueBooking ;
		do {
			 System.out.println("RAILWAY RESERVATION SYSTEM");
			 System.out.println("1.Search for Train");
			 System.out.println("2.Book Ticket");
			 System.out.println("3.Cancel Ticket");
			 System.out.println("4.View Available Seats");
			 System.out.println("5.Print Ticket");
			 System.out.println("6.Exit");
			  
			 System.out.println("Enter Choice :");
			 choice=sc.nextInt();
			 switch(choice) {
			 case 1->{
				 System.out.println("Available Trains");
				 System.out.println("1.Intercity Express ");
				 System.out.println("2.Vande Bharat Express");
				 System.out.println("3.Godavari Express");
			 }
			 case 2->{
				 System.out.println("Enetr your Full Name :");
				 sc.nextLine();
				 passengerName=sc.nextLine();
				 System.out.println("Enetr your age :");
				 age=sc.nextInt();
				 
				 System.out.println("Select Gender");
				 System.out.println("1.Male");
				 System.out.println("2.Female");
				 System.out.println("3.Others");
				 int gen=sc.nextInt();
				 switch(gen) {
				 case 1->{
					 gender="Male";
				 }
				 case 2->{
					 gender="Female";
				 }
				 case 3->{
					 gender="Others";
				 }
				 default->{
					 gender="Not Specified";
				 }
				 }
				 System.out.println("Select Train ");
				 System.out.println("1.InterCity");
				 System.out.println("2.Vande Bharat Express");
				 System.out.println("3.Godavari Express");
				 trainChoice=sc.nextInt();
	           
				 switch(trainChoice) {
				 case 1->{
					 ticketPrice=500;
				 }
				 case 2->{
					 ticketPrice=700;
				 }
				 case 3->{
					 ticketPrice=900;
				 }
				 default->{
					 System.out.println("The selected Train is Invalid");
//					 continue;
				 }
				 }
	             
				 if(age>=60) {
					 ticketPrice=ticketPrice-(ticketPrice*0.20);
					 System.out.println("20% Senior Citizen Discount is Applied");
				 }
				 System.out.println("Ticket Booked Successfully");
				 System.out.println("Seat number  :"+seatNo++);
				 System.out.println("Ticket Price :"+ticketPrice); 
			 }
			 case 3->{
				 if(passengerName.equals("")) {
					 System.out.println("No Ticket Booked Yet !!");
				 }else {
					 passengerName="";
					 gender="";
					 age=0;
					 trainChoice=0;
					 ticketPrice=0;
					 System.out.println("Ticket Cancelled Successfully"); 
				 }
			 }
			 case 4->{
				 System.out.println("Available Seat Inforamtion");
				 System.out.println("Total seats     :100");
				 System.out.println("Booked Seats    :"+(seatNo-1));
				 System.out.println("Available seats :"+(100-(seatNo-1)));
			 }
			 case 5->{
				 if(passengerName.equals("")) {
					 System.out.println("No Ticket Booked Yet!!");
					 
				 }else {
					 System.out.println("TRAIN TICKET ");
					 System.out.println("Passenger Name :"+passengerName);
					 System.out.println("Age            :"+age);
					 System.out.println("Gender         :"+gender);
					 switch(trainChoice) {
					 case 1->{
						 System.out.println("Train : Intercity Express");
					 }
					 case 2->{
						 System.out.println("Train : Vande Bharat Express");
			
					 }
					 case 3->{
						 System.out.println("Train : Godavari Express ");
					 }
					 }
					 System.out.println(" Ticket Price :Rs."+ticketPrice);
				 }
			 }
			 case 6->{
				 System.out.println("Thank You For Using Railway Reservation System");
			 }
			 default->{
				 System.out.println("Invalid Choice");
			 }
			 }
			 if(choice==6) {
				 break;
			 }
			 System.out.println("Do You Want To Continue(YES/NO):");
			 continueBooking=sc.next();
	
		}while(continueBooking.equalsIgnoreCase("YES"));
		sc.close();
	}

}
