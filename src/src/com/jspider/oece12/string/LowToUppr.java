package com.jspider.oece12;

import java.util.Scanner;

public class LowToUppr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string..");
		String s=sc.nextLine();
		System.out.println(converting(s));
		
	}
		static String converting(String s) {
		String s1 = " ";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z')
				s1 += Character.toLowerCase(c);
			else
				s1 += Character.toUpperCase(c);
		}
		return s1;
	}

}

