package com.jspider.oece12.practice;

import java.util.Scanner;

public class PascalTrianglr {

	public static void main(String[] args) {
		int i,j,k;
		int lenght=1;
		System.out.println("enter the element..");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(k=n;k>=i;k--)
				System.out.print(" ");
			lenght=1;
			for(j=1;j<=i;j++)
			{
				System.out.print(lenght+" ");
				lenght=lenght*(i-j)/(j);
			}
			System.out.println();
		}
	}

}
