package com.jspider.oece12.practice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number..");
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			System.out.println("perfect number");
		else
			System.out.println("not perfect");
	}

}
