package com.exceptionhandling;

public class Test4 {

	public static void main(String[] args) {
		try {
			String name="Anjali";
			System.out.println(name.charAt(6));
			int l=name.length();
			System.out.println(10/l);
		} 
		catch(StringIndexOutOfBoundsException |ArithmeticException e) {
			System.out.println("In "+e);
//		}catch(ArithmeticException e) {
//			System.out.println("In AE");
//		}catch(RuntimeException e) {
			
		}
		
		catch(Exception e) {
			
		}
		System.out.println("Main Method Ended");

	}

}
