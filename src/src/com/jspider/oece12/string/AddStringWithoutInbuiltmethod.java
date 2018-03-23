package com.jspider.oece12;

import java.util.Scanner;

public class AddStringWithoutInbuiltmethod {

	public static void main(String[] args) {
		System.out.println("enter the two string..");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3= join(s1,s2);
		System.out.println(s3);
	}
		
   public static String join(String s1,String s2)
		{
			char[] a=s1.toCharArray();
			char[]b=s2.toCharArray();
			char[] c=new char[a.length+b.length];
			for (int i = 0; i < a.length; i++) 
				c[i]=a[i];
			for (int j = a.length,i=0;j < c.length; j++,i++) 
				c[j]=b[i];
			return new String (c);
		}
}
