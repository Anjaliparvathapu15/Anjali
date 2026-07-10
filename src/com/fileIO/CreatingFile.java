package com.fileIO;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method started");
		File f=new File("C:\\Users\\anjal\\Anjali Java\\Test\\Anjali.txt");
		boolean status=f.createNewFile();
		if(status) {
			System.out.println("File created successfully!!");
		}else {
			System.out.println("File already exist!!");
		}
		System.out.println("Main method ended");
	}

}
