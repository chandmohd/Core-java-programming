package com.jspider.oece12.practice;

import java.util.Scanner;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int count=0;
		int i,j;
		for(i=a;i<=b;i++)
	{
		for(j=2;j<=i-1;j++)
		{
		if(i%j==0)
		break;
		}
      if(j==i)
       //System.out.println(i);
      count+=i;
	}
		System.out.println(count);
	}
}