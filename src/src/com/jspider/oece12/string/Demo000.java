package com.jspider.oece12.practice;

import java.util.Arrays;

public class Demo000 {

	public static void main(String[] args) {
		String s="chand";
		String s1="mohd";
		String s2=" ";
		char []c=s.toCharArray();
		char[] c1=s1.toCharArray();
		char[]d=new char[c.length+c1.length];
		System.arraycopy(c, 0, d, 0,c.length);
		System.arraycopy(c1, 0, d, c.length, c1.length);
		s2=new String (d);
		System.out.println(s2);
		System.out.println("ndchdiufvh");
		int arr[]={1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		//System.out.println(Arrays.toString(arr));
		
		
	}

}
