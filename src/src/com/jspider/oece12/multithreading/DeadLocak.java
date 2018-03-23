package src.com.jspider.oece12.multithreading;

public class DeadLocak extends Thread {
	static Thread mainThread;

	public void run() {
		System.out.println("child thread is waiting for main thread to complete");
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			System.out.println("child thread execution complete");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		DeadLocak.mainThread = Thread.currentThread();
		DeadLocak thread = new DeadLocak();
		thread.start();
		System.out.println("main thread is waiting for child thread to complete");
		thread.join();
		System.out.println("main thread execute completly");
	}
}
