package src.com.jspider.oece12.Number;

import java.util.Scanner;

public class sumOfdigit {
	public static void main(String[] args) {
		 System.out.println(countOfdigit(123456));
	}

	private static int countOfdigit(int number) {
		return (number %9 == 0? 9:number%9);
	}

}
