package com.jspider.oece12.Number;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number..");
		int n=sc.nextInt();
		String s="";
		while(n!=0)
		{
			s=n%2+s;
			n/=2;
		}
		System.out.print(s);
	}

}
