package com.jspider.oece12.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;

public class RemoveSpecificElement {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[]a={2,3,4,5,6,7};
		System.out.println("origional array:"+Arrays.toString(a));
		System.out.println("enter the index");
		int b[]=remove(a,sc.nextInt());
		System.out.print("\nafter removing specific element:"+Arrays.toString(b));

	}
	public static int [] remove(int a[],int index)
	{
		int[]b=new int[a.length-1];
			for (int j = 0; j < index; j++) 
				b[j]=a[j];
			for (int j = index+1; j < a.length; j++) 
				b[j-1]=a[j];
			return b;
		
	}
	
	
}
