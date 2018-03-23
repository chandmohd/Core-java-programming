package com.jspider.oece12;

import java.util.Scanner;

public class ReversingStringByString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size...");
		int size=sc.nextInt();
		System.out.println("enter the string..");
		String []s=new String[size];
		for (int i = 0; i < s.length; i++)
			s[i]=sc.next();
		for (int i = 0; i < s.length; i++) 
		{
			String s1=" ";
			for (int j = s[i].length()-1; j>=0; j--) 
				s1+=s[i].charAt(j);
			System.out.print(s1);
		}
		
	}

}
