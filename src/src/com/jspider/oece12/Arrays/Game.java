package com.jspider.oece12.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array..");
		int size=sc.nextInt();
		int []arr=new int[size];
		int brr[]=new int [120];
		boolean b=false;
		System.out.println("enter the element..");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<arr.length;i++)
			brr[arr[i]]++;
		System.out.println(Arrays.toString(arr));
		System.out.println("enter the querry...");
		int Q=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(Q==arr[i])
			{
				System.out.println(brr[Q]);
				b=true;
				break;
				
			}
		}
		if(b!=true)
		System.out.println("NOT PRESENT");
	}

}
