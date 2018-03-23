package com.jspider.oece12.Number;

import java.util.Scanner;

public class BinaryToOctal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the binary number....");
		int bin=sc.nextInt();
		String s="";
		while(bin>0)
		{
			s=bin%8+s;
			bin/=8;
		}
		System.out.println(s);		
	}

}
