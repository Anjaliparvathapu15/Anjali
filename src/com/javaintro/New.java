package com.javaintro;

//we can create interfaces,enum same like classes
class New {
	{
		System.out.println("instance block");

	}

	// public static strictfp synchronized final void main(String[]args)
	// we can use this words in main method strictfp throws warning because from
	// java 17 version the purpose
	// is achieved directly so no need to use strictfp
	void main() {
		System.out.println("hello main method");
		// System.exit(0);--> if we use this the JVM will terminate
		teja();
	}

	void anjali() {
		System.out.println("anjali");
	}

	void teja() {
		System.out.println("teja");
		// New n1=new New();
		// n1.anjali();
	}

	// for formated code cntrl shift f
	static {
		System.out.println("static");
		New n2 = new New();
		n2.teja();
	}
}
