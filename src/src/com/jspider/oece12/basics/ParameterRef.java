package src.com.jspider.oece12.basics;

public class ParameterRef {
	public static void main(String[] args) {
		print(10);
		print(10.0);
	}

	private static void print(int ele) {
		System.out.println("int value print");
	}

	private static void print(Object ele) {
		System.out.println("object value printed");

	}

	private static void print(long ele) {
		System.out.println("long value printed");

	}

	private static void print(float ele) {
		System.out.println("float value printed");

	}

	private static void print(double ele) {
		System.out.println("double value printed");

	}

}
