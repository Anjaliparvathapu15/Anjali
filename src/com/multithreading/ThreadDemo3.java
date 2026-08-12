package com.multithreading;

public class ThreadDemo3 extends Thread{

	public static void main(String[] args) {
		ThreadDemo3 t= new ThreadDemo3();
		t.start();
// IllegalThreadStateException occur if we try to start the thread more than ones.
//		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main = "+i);
		}

	}
// if we not override the run method then the thread class run method will execute in that there is nothing to execute 
// here thread is created but it is executing the empty method there is no useful task is performed 
//	@Override
//	public void run() {
//		System.out.println("Run method called ");
//		for(int i=0;i<10;i++) {
//			System.out.println("Run = "+i);
//		}
//	}

}
