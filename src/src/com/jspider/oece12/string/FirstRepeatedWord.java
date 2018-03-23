package com.jspider.oece12;

public class FirstRepeatedWord {

	public static void main(String[] args) {
		String str="banana khao";
		char[]c=str.toCharArray();
		int[]a=new int[128];
		System.out.println(str.length());
		System.out.println(str);
		for (int i = 0; i<str.length(); i++) 
			a[c[i]]++;
		for (int i = 0;i<c.length-1;i++) 
		{
			if (a[c[i]]==1) 
			{
				System.out.println(c[i]);
				break;
			}
		}
	}

}
