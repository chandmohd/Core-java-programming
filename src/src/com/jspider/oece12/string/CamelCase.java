package com.jspider.oece12;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of strinjg array...");
		int size = sc.nextInt();
		System.out.println("enter the string..");
		String[] s = new String[size];
		for (int i = 0; i < s.length; i++)
			s[i] = sc.next();
		String s1 = " ";
		for (int i = 0; i < size; i++) {
			char[] c = s[i].toCharArray();
			for (int j = 0; j < c.length; j++) {
				if (j == 0)
					s1 += Character.toUpperCase(c[j]);
				else
					s1 += Character.toLowerCase(c[j]);
			}
			s1 += " ";
		}
		System.out.println("string after camel case are........");
		System.out.println(s1);
	}
}
