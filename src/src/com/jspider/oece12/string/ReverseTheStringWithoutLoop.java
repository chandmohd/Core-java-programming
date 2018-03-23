package com.jspider.oece12;

import java.util.Scanner;

public class ReverseTheStringWithoutLoop {

	public static void main(String[] args) {
		System.out.println("entr the string..");
		Scanner se=new Scanner(System.in);
		String s=se.nextLine();
		String s1=rev(s);
		System.out.println(s1);
	}
	public static String rev(String s)
	{
		if(s==null)return null;
		if(s.length()>0)
		return s.charAt(s.length()-1)+ rev(s.substring(0, s.length()-1));
		return "";
	}

}
