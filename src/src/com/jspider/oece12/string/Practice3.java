package com.jspider.oece12.practice;

public class Practice3 {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		int x=0;
		int y=0;
		for(int i=0;i<5;i++)
		{
			if ((++x>2)&&(++y>2))
			{
				x++;
			}
		}
	System.out.println(x+" "+y);
	System.out.println(System.currentTimeMillis());
	}

}
