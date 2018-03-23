package com.jspider.oece12.multithreading;

public class CurrentThread {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();//
		System.out.println("current thread:"+t);
		t.setName("chandthread");
		System.out.println("my thread :"+t);
	}

}
