package com.multithreading;

public class ThreadDemo5 extends Thread{

	public static void main(String[] args) {
		ThreadDemo5 t=new ThreadDemo5();
		t.start();
//		t.run(); we can call run method any number of times it is consider as a normal method call
//		t.run();
//		t.setPriority(MAX_PRIORITY);
//		Thread.currentThread().setPriority(100); java.lang.IllegalArgumentException
		//two thread can have the same name
		Thread.currentThread().setPriority(MIN_PRIORITY);
		Thread.currentThread().setName("Anjali");
//		Thread.currentThread().setName(null); NPE
		System.out.println(Thread.currentThread());
		for(int i=0;i<10;i++) {
			System.out.println("Main ="+i);
		}
		

	}
	@Override
	public void run() {
		System.out.println("Run ");
		Thread.currentThread().setPriority(MAX_PRIORITY);		
		Thread.currentThread().setName("Anjali");
		System.out.println(Thread.currentThread());
		for(int i=0;i<10;i++) {
			System.out.println("Run ="+i);
		}
	}

}
