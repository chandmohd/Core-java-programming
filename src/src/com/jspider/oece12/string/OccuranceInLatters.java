package com.jspider.oece12;

import java.util.Scanner;

public class OccuranceInLatters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string...");
		String s=sc.nextLine();
		while(!s.equals(""))
		{
		char c=s.charAt(0);
		int n=s.length()-s.replace(c+"","").length();//5-1=4
		System.out.println(c+"="+n);
		s=s.replace(c+"","");
		}
		
	}

}
