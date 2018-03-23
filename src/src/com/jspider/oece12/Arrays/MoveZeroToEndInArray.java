package com.jspider.oece12.Arrays;
import java.util.Arrays;
class Main
{
	public static String moveZeroToEnd(int[]a)
	{
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0)
			{
				a[count++]=a[i];
			}
		}
			while(count<a.length)
			{
				a[count++]=0;
			}
		return(Arrays.toString(a));
	}
	public static void main(String[] args) { 
		moveZeroToEnd(new int[]{10,0,3,0,4,0,5,6,0,7,0});
		moveZeroToEnd(new int[]{7,3,0,5,4,0,5,6,0,7,0,0});
		System.out.println("chand mohd");
		
	}		
}
	
