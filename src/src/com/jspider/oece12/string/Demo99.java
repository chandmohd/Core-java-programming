package com.jspider.oece12.practice;

public class Demo99 {

	public static void main(String[] args) {
		int[]arr={1,2,3,-1,-3,-2};
		for(int i=0;i<arr.length/2;i++)
		{
			int last=arr[arr.length-i-1];
			System.out.print(last+","+arr[i]);
		}
	}

}
