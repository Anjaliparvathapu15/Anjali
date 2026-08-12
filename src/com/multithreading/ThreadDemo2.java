package com.multithreading;

public class ThreadDemo2 implements Runnable {

	public static void main(String[] args) {

			ThreadDemo1 t= new ThreadDemo1();
			Thread t1=new Thread(t);
			t1.start();
			for(int i=0;i<10;i++) {
				System.out.println("Main"+i);
			}

		}

		@Override
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.println("Run"+i);
			}
			
		}
		//start() method calls only the  no-agrumnet run method
		//it will consider as a normal method to execute it we need to call it explicitly
		public void run(String s) {
			for(int i=0;i<10;i++) {
				System.out.println("Run with 1"+i);
			}
		}
	


	}


