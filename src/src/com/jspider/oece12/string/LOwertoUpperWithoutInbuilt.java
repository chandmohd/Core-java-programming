package com.jspider.oece12;

public class LOwertoUpperWithoutInbuilt {
	public static void main(String[] args) {
		String s="chAnd";
		char c[]=s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
		if(c[i]>=97)
		{
			c[i]= (char) (c[i]-32);
			System.out.print(c[i]);
		}
		else
		System.out.print(c[i]);
		}
	}

}
