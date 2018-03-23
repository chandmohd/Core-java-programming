package com.jspider.oece12;

import java.util.Scanner;

public class PanagramWithBuiltMethod {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		boolean res=false;
		if(s.length()>0&&s!=null)
		{
			res=isPanagram(s);
			if(res)
			System.out.println(s+" is panagram");
			else
				System.out.println(s+" not panagram");
		}
		else
			System.out.println("invalid string.!!");
		
	}
	public static boolean isPanagram(String s) 
	{
		if(s.length()<26) return false;
		s=s.toLowerCase();
		for(char c='a';c<='z';c++)
		{
			if(!s.contains(c+""))
				return false;
		}
		return true;
		
	}

}
