package com.jspider.oece12;

import java.util.Scanner;

public class AddingPositoWhera1andA28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int temp=0;
		int a=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>=97)
			{
				a=(s.charAt(i))-96;
				temp+=a;
			}
			else
			{
				a=(s.charAt(i))-37;
				temp+=a;
			}
		}
		System.out.println("sum of characters of given values is:\n"+s+"="+temp);
		
	}

}
