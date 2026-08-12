package com.multithreading;
class test{
	
}
public class ThreadDemo1 extends test implements Runnable{

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

}
