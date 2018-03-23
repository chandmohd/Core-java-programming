package com.jspider.oece12.Number;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the binary number....");
		/*.......1st method with inbulit method..........
		int no=Integer.parseInt(sc.nextLine(),2);
		System.out.println(no);*/
		int d=0,i=1;
		int b=sc.nextInt();
		while(b!=0)
		{
			int rem=b%10;
			d=d+rem*i;
			i*=2;
			b/=10;
		}
		System.out.println(d);		
	}

}
