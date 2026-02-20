package com.langfundamental;

public class Library {
	static int BookIsueed;
	static int memberCount;
	int memberId;
	int Booktaken;
	static {
		BookIsueed=5;
		memberCount=10;
	}
	{
		memberId = memberCount;
		memberId++;
	}
	static void libraryrule() {
		System.out.println("Library rule is Each Student can borrow up to "+BookIsueed);
	}
	
	public static void main(String[] args) {
		libraryrule();
		

	}

}
