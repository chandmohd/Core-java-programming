package com.jspider.oece12.Arrays;
public class DistintValue {
public static void isDistinct(int[]arr)
{
	for(int i=0;i<arr.length;i++)
	{
		boolean distict=false;
		for(int j=0;j<i;j++)
		{
			if(arr[i]==arr[j])
			{
				distict=true;
			    break;
			}
		}
	if(distict!=true)
		System.out.print(arr[i]+" ");
  }
}
public static void main(String[] args) {
	int[]arr={1,2,3,2,3,3,3,3,3,4,4,5,5,6};
	isDistinct(arr);
}
}
		
