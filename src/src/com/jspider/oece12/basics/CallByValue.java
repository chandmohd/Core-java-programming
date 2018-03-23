package src.com.jspider.oece12.basics;

public class CallByValue {
	int i =0;
	public static void main(String[] args) {
		CallByValue t= new CallByValue();
		int i =1;
		int j = callByValue(i);
		System.out.println(t.i+ " "+j);//4
	}
	private static int callByValue(int i) {
		i =2;
		i*=2;
		return i;
	}
}
