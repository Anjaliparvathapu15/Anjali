package com.jdbc.parctice;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ModelClass m= new ModelClass();
		System.out.println("enter the model details :");
		m.setId(sc.nextInt());
		m.setName(sc.next());
		m.setEmail(sc.next());
		DaoInf d=new Daoimp();
		boolean status=d.addStudent(m);
		if(status) {
			System.out.println("Model is inserted ");
		}else {
			System.out.println("Insertion failed ");
		}
		sc.close();

	}

}
