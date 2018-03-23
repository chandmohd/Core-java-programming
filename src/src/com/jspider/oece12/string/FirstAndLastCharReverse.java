package com.jspider.oece12;

import java.util.Scanner;

public class FirstAndLastCharReverse {

	public static void main(String[] args) {
		System.out.println("enter the size of an string array...");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] ss = new String[size];
		System.out.println("enter the string..");
		for (int i = 0; i < ss.length; i++)
			ss[i] = sc.next();
		for (int i = 0; i < ss.length; i++) {
			char[] a = ss[i].toCharArray();
			a[0]=(char) ((char)(a[0]+a[a.length-1])-(char)((a[a.length-1]=a[0])));
			ss[i] = new String(a);
			System.out.print(ss[i]+" ");	
			}
	}
}
