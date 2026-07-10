package com.fileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	public static final long serialVersionUID = -2088250950861319381L;
	String userName = "Anjali";
	transient String password = "Javaissimple@15";
	int age = 22;
	long phone = 9502788459L;
}

public class FileIO {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method Started");
		Employee e1 = new Employee();
		FileOutputStream fos = new FileOutputStream("C:\\Users\\anjal\\Anjali Java\\Test\\anju.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.close();
		fos.close();

	}

}
