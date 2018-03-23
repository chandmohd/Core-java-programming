package com.jspider.oece12.Arrays;

import java.util.Arrays;

public class DuplicateInArray {

	public static void main(String[] args) {
		int[]arr={1,2,2,3,3,4,4,55,6,7,8,8};//2,3,4,8
		duplicate(arr);
	}
	public static void duplicate(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean b=false;
			for(int j=0;j<i;j++)
			{
				if(arr[j]==arr[i])
				{
					b=true;
					break;
				}
			}
			if(b)
			System.out.println(arr[i]+" ");
		}
	}
}
