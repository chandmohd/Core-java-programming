package com.jspider.oece12.Arrays;

import java.util.Arrays;

public class SeparatingnegativePositive {

	public static void main(String[] args) {
		int arr[]={1,2,3,-1,-3,-2};
		int brr[]=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==-arr[j])
				{
				brr[k++]=arr[j];
				brr[k++]=arr[i];
				}
			}
		}
		System.out.println(Arrays.toString(brr));
	}

}
