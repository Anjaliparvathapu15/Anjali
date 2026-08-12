package com.multithreading;

public class ThreadDemo4 extends Thread {

	public static void main(String[] args) {
		ThreadDemo4 t = new ThreadDemo4();
		t.start();
		t.setName("Teja ");
		System.out.println(Thread.currentThread());

	}
	@Override
	public void run() {
		//infinite loop
//		ThreadDemo4 t = new ThreadDemo4();
//		t.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println("Run Method called");
	}
	

}
