package com.jspider.oece12;

public class AddingThePositions {

	public static void main(String[] args) {
		String s="chand";
		String s1=s.toLowerCase();
		int temp=0;
		if (s1==null)
			System.out.println("empty string ...");
		for (int i = 0; i < s.length(); i++) 
		{
			int a=(s1.charAt(i))-96;
			temp=temp+a;
		}
		System.out.println(s+"="+temp);
		
	}

}
