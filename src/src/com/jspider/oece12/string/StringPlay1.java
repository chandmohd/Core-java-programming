package com.jspider.oece12;

import java.util.Scanner;

public class StringPlay1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string size..");
		int size=sc.nextInt();
		String []s=new String[size];
		int i;
		System.out.println("enter the string..");
		for (i = 0; i < s.length; i++)
		 s[i]=sc.next();
	
		for (int j = 0; j < s.length; j++) 
		{
			System.out.print(s[j]);
			System.out.print(s[j].length());	
		}
	}

}
