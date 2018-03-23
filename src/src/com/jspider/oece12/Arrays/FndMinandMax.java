package com.jspider.oece12.Arrays;

public class FndMinandMax {

	public static void main(String[] args) {
		int[]a={1,2,3,4,5,6,0,9,999,88,77,88,2,2,0,0,555};
		int min=0,max=0;
		min=a[0];
		for (int j = 0; j< a.length; j++) 
		{
			if(min>a[j])
			{
				min=a[j];
			}
			max=a[j];
		}
		System.out.print("min:"+min+"\nmax:"+max);
	}

}
