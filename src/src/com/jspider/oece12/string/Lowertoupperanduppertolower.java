package com.jspider.oece12;
import java.util.Scanner;
public class Lowertoupperanduppertolower {

	public static void main(String[] args) {
		System.out.println("enter the string.");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=" ";
		System.out.println("string before coversio..\n"+s);
	char[]c=s.toCharArray();
	for (int i = 0; i < c.length; i++) 
	{
		if (c[i]>=97&&c[i]!=' ') 
		{
			s1+=(char)(c[i]-32);
			//System.out.print(c[i]);
		}
		else if(c[i]!=' ')
		{
			s1+=(char)(c[i]+32);
			//System.out.print(c[i]);
		}
		else	
		s1+=c[i];
		}
	System.out.print("String after convertion\n"+s1);
	}

}
