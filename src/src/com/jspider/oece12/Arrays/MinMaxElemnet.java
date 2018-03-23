package com.jspider.oece12.Arrays;

import java.util.Arrays;

public class MinMaxElemnet {

	public static void main(String[] args) {
		int arr[]={3,4,5,1,3,5,0,8};
		System.out.println(Arrays.toString(alternateSorting(arr)));
	}
	public static int []alternateSorting(int arr[]) 
	{
		Arrays.sort(arr);
		int brr[]=new int [arr.length];
		int count=0,length=0;
		for(int i=0;i<arr.length;i++)
		{
		if(i%2==0)
		{
			brr[i]=arr.length-length++;
		}
		else
			brr[i]=arr[count++];
		}
		return brr;
		
	}

}
