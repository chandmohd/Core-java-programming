package com.jspider.oece12.Number;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number...");
		int n=sc.nextInt();
		String s="";
		String s1="";
		while(n!=0)
		{
			s=n%8+s;
			n/=8;
		}
		System.out.println(s);
	}
}
