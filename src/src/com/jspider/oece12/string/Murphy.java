package com.jspider.oece12.practice;

import java.util.Scanner;

public class Murphy {

	public static void main(String[] args) 
	{
		int small=Integer .MIN_VALUE;
		int large=Integer.MAX_VALUE;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int num=sc.nextInt();
			if(num>small)
				small=num;
			if(num<large)
				large=num;
		}
		System.out.print(large+"\n"+small);
	}

}
