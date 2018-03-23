package com.jspider.oece12.Arrays;

public class FindTheIndexOfElement {

	public static void main(String[] args) {
		int[]a={1,22,33,44,55,66,77,88,99,909,2,34,4,554,666,787};
		System.out.println("index of specific element is"+index(a,666));
	}
	public static int index(int[]a,int b) 
	{
		for(int i=0;i<=a.length;i++)
		{
			if(a[i]==b) return i;
		}
		return b;
		
	}

}
