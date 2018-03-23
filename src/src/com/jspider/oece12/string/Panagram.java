package com.jspider.oece12;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string..");
		String s=sc.nextLine();
		boolean res=false;
		if(s!=null&&s.length()>0)
		{
			res=isPanagram(s);
			if(res)
				System.out.println("panagram");
			else
				System.out.println("not");
		}
		else
			System.out.println("envalid string !!!");
	}
	public static boolean isPanagram(String s1) 
	{
		int []arr=new int[128];
		char[]ch=s1.toLowerCase().toCharArray();
		System.out.println(ch.length);
		if(ch.length<26)
			return false;	
		for(int i=0;i<ch.length;i++)
			if(ch[i]!=' ')
				arr[ch[i]]++;
		for(int i=0;i<arr.length;i++)
			if(arr[i]>=1)
				return true;
		return false;
		
		
		
	}

}
