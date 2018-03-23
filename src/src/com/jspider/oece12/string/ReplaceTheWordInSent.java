package com.jspider.oece12;

import java.util.Scanner;

public class ReplaceTheWordInSent {

	public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the string..");
    String str=sc.nextLine();
    String srr[]=split(str);
    System.out.println("enter the replacing word..");
    String r=sc.next();
    String s="";
    for(int i=0;i<srr.length;i++)
    {
    	s=srr[i];
    	srr[i]=r;
    	for(int j=0;j<srr.length;j++)
    	{
    		System.out.print(srr[j]+" ");
    	}
    	srr[i]=s;
    	System.out.println();
	}
	}
	public static String [] split(String str)
	{
		int space=0;
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==' ')
				space++;
		String srr[]=new String [space+1],temp="";
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

}
