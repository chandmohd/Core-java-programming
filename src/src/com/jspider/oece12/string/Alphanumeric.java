package com.jspider.oece12;

import java.util.Scanner;

public class Alphanumeric {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string with elphanumeric ..");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9')
				System.out.print(c);
			// System.out.print(c);
		}
	}

}
