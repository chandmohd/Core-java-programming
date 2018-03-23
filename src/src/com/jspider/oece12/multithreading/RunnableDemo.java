package src.com.jspider.oece12.multithreading;

import java.util.concurrent.TimeUnit;

class Runnable1 implements Runnable {
	private int counter = 0;

	public void run() {
		System.out.println(" interface "+Thread.currentThread().getName() + " is executing :counter " + counter++);
	}
}

class ThreadExtend extends Thread
{
	private int counter = 0;

	public void run() {
		System.out.println(Thread.currentThread().getName() + " is executing :counter " + counter++);
		
	}
}

public class RunnableDemo{

	public static void main(String[] args) throws InterruptedException {
		 //basically when you implemets runnable interface then all the child thread gonna use same runnable object
		Runnable1 runnable1 = new Runnable1();
		Thread thread = new Thread(runnable1);
		thread.start();
		Thread thread1 = new Thread(runnable1);
		thread1.start();
		Thread thread2 = new Thread(runnable1);
		thread2.start();
		System.out.println("-----------------------------------------------------------");
		
		//when you extends Thread class to create new thread it gonna create unique object each time 
		ThreadExtend t= new ThreadExtend();
		t.start();
		ThreadExtend t1 = new ThreadExtend();
		t1.start();
		ThreadExtend t2 = new ThreadExtend();
		t2.start();
	}
	
}
