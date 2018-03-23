package com.jspider.oece12.Arrays;

import java.util.Scanner;

public class AveragValueOfArray {

	public static void main(String[] args) {
		int sum=0;
		 Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		 System.out.println("enter the element of array");
		 int[]a=new int[size];
		 for (int i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
			 sum+=a[i];
		 }
		 System.out.println("average value of array:\n"+(sum/a.length));
	}

}
