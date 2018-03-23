package com.jspider.oece12.Arrays;

import java.util.Scanner;

public class ReverseTheEachWordInGivenSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string...");
		String str=sc.nextLine();
		System.out.print(reverse(str));
		str.split("");
	}
	public static String reverse(String str)
	{
		String rev="",temp="";
		for(int i=0;i<=str.length()-1;i++)
		{
			temp+=str.charAt(i);
			if(str.charAt(i)==' '||i==str.length()-1)
			{
				for(int j=temp.length()-1;j>=0;j--)
				{
					rev+=temp.charAt(j);
					if(j==0&&j!=str.length()-1)
						rev+=" ";
				}
				temp="";
			}
		}
		return rev;
		
	}

}
