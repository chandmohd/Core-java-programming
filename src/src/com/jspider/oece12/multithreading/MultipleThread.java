package com.jspider.oece12.multithreading;

class NewThread implements Runnable {
	String name;
	Thread t;

	public NewThread(String name) {
		this.name = name;
		t = new Thread(this, name);
		System.out.println("new thread:" + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(name+":"+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + "interupted");
		}
		System.out.println(name + "exiting");
	}
}

public class MultipleThread {

	public static void main(String[] args) {
		new NewThread("one");
		new NewThread("two");
		new NewThread("three");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("main thread interupted");
		}
		System.out.println("main thread exiting..");

	}

}
