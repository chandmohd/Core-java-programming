package src.com.jspider.oece12.multithreading;
class Thread1 extends Thread
{
	public void  run() 
	{
		System.out.println("Thread "+Thread.currentThread().getName()+" is running");
	} 
}
public class Demo1 {

	public static void main(String[] args) {
		System.out.println(",main start");
		for (int i=0;i<10;i++)
		{
			new Thread1().start();
		}
		
	}

}
