package com.jspider.oece12;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.Chromaticity;

public class IsItPoassibleToMakePalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string..");
		String str = sc.next();
		int count = 0, k = 0,l=0,m=0;
		int brr[] = new int[128];
		char ch[] = str.toCharArray();
		char c1[] = new char[ch.length / 2];
		char c2[] = new char[ch.length / 2];
		for (int i = 0; i < str.length(); i++) {
			brr[ch[i]]++;
		}
		if (ch.length % 2 == 0) {
			int arr[] = new int[str.length() / 2];
			for (int i = 0; i < brr.length; i++) {
				if (brr[i] == 2)
					arr[k++] = brr[i];
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 2) {
					System.out.println("palindrome not possible");
					return;
				}
			}
			Arrays.sort(ch);
			for (int i = 0; i < ch.length; i++) {
				if (i % 2 == 0)
					c1[l++] = ch[i];
				else
					c2[m++] = ch[i];
			}
			String s1 = new String(c1);
			String s2 = "";
			for (int i = s1.length() - 1; i >= 0; i--)
				s2+= s1.charAt(i);
			String s4 = new String(s1+ s2);
			System.out.println("palindrome possible");
			System.out.println(s4);

		}
		else
		{
			int arr[]=new int[str.length()/2+1];
			for(int i=0;i<brr.length;i++)
			{
				if(brr[i]==1)
				{
					arr[k++]=brr[i];
				     break;
				}
				 if(brr[i]==2)
					arr[k++]=brr[i];
			}
			System.out.println(Arrays.toString(arr));
			Arrays.sort(ch);
			char c=' ';
			for(int i=0;i<ch.length;i++)
			{
				if(arr[i]==1)
				{
					System.out.println(arr[i]);
					c=ch[i];
					System.out.print(c);
					//ch[i]=' ';
				}
				 if(i%2==0)
					c1[l++]=ch[i];
				else 
					c2[m++]=ch[i];
			}
			String s1=new String(c1);
			String s2=new String(c+"");
			String s3="";
			for(int i=s1.length()-1;i>=0;i--)
				s3+=s1.charAt(i);
			System.out.println(s3+s2+s1);
			
			
		}

	}
}
