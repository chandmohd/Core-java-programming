package com.jspider.oece12;

import java.util.Scanner;

public class AddingString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  string...");
		String str=sc.nextLine();
		String []srr=split(str);
		for (int i = 0; i < srr.length; i++) 
		{
			int temp=0;
			for (int j = 0; j < srr[i].length(); j++) 
			{
				int a=(srr[i].charAt(j))-96;
				temp+=a;
			}
			System.out.println(srr[i]+"="+temp);
		}
	}
//***********************spliting string into string array**************
	public static String[] split(String str)
	{
		int space=0;
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==' ')
				space++;
		String srr[] = new String[space + 1], temp = "";
		for(int i=0,j=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				srr[j++]=temp;
				temp="";
			}
			else
				temp+=str.charAt(i);
			srr[j]=temp;
		}
		return srr;
	}
//******************************************************************************

}
