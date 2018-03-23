package com.jspider.oece12.Arrays;

import java.util.Arrays;

public class DeleteDuplicateFromArray {
	public static void main(String[] args) {
		int arr[]={1,2,2,3,4,5,5,6,7,8,8};//1,3,4,6,7
		deleteDuplicate(arr);
	}
	public static void deleteDuplicate(int[]arr) 
	{
		int brr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			brr [arr[i]]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(brr[arr[i]]<2)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}