package com.fileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\Users\\anjal\\Anjali Java\\Test\\anju.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee obj = (Employee) ois.readObject();
		System.out.println(obj.userName);
		System.out.println(obj.password);
		System.out.println(obj.age);
		System.out.println(obj.phone);
		ois.close();
		fis.close();

	}

}
