package com.jspider.oece12;

import java.util.Scanner;

public class ReverseWordInGivenString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string..");
		String []s=new String[2];
		int i=0;
		for ( i = 0; i < s.length; i++)
			s[i]=scan.next();
		for  (i =s.length-1;i>=0;i--) 
			System.out.print(s[i]+" ");
	}

}
