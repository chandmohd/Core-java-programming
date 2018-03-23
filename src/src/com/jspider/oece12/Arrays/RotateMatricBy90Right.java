package com.jspider.oece12.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateMatricBy90Right {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][4];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the "+i+ "element");
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=sc.nextInt();
		}
		System.out.println("array befor 90 degree rotation...");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		System.out.println("array before 90 degree ratation..");
		int [][]brr=RotateCW(arr);
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
				System.out.print(brr[i][j]+" ");
			System.out.println();
		}
	}
	public static int[][] RotateCW(int arr[][])
	{
		int brr[][]=new int[arr[0].length][arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				brr[j][arr.length-1-i]=arr[i][j];
			}
		}
		return brr;
		
	}
}