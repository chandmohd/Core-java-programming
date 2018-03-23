package com.jspider.oece12.practice;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element..");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		System.out.print(fibbonaci(i)+" ");
	}
	public static int fibbonaci(int n)
	{
		if (n==1|n==2)
			return 1;
		return fibbonaci(n-1)+fibbonaci(n-2);
	}
		
	}

