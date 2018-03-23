package com.jspider.oece12;

import java.util.Scanner;

public class CountOwvels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string..");
		String s = sc.nextLine();
		int count = 0;
		int cont=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'i' || c == 'o' || c == 'e' || c == 'u')
				count++;
			else 
				cont++;
		}
		System.out.println("no of vowel are:"+count);
		System.out.println("no of const are:"+cont);
	}

}
