package com.javaintro;
//if the class is not public we can create multiple classes with main methods
//for executing this program right click on class -->run as-->java application

 class Pavani {
	 //if we keep private warning:the method main() from the type Pavani is never used locally
	// then use @SuppressWarnings("unused")
	 void main() {
		System.out.println("hello world");	
	}

}
 class Pavani1 {
		public static void main(String[] args) {
			System.out.println("hello world1");	
		}

	}
 class Pavani2 {
		void main() {
			System.out.println("hello world2");	
		}

	}
 class Pavani3 {
		void main() {
			System.out.println("hello world3");	
		}

	}
