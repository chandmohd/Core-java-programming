package com.jspider.oece12.Number;

import java.util.Scanner;

public class DEcimalToHexa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the decimal");
		int dec = sc.nextInt();
		//.............usind inbuilt method...........//
		//System.out.println(Integer.toHexString(dec));
		String s="";
		int rem=0;
		char[] hex={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(dec>0)
		{
			rem=dec%16;
			s=hex[rem]+s;
			dec/=16;
		}
		System.out.println(s);
	}

}
