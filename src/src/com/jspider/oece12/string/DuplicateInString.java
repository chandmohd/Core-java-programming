package com.jspider.oece12;

public class DuplicateInString {

	public static void main(String[] args) {
		System.out.println("enter the string");
		String s="chand mohd murphy";
		char[]a=s.toCharArray();
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;
			char c=a[i];
			for (int j = 0; j < a.length; j++) 
			{
			if (c==a[j])
				count++;
			}
			if(count>1&&a[i]!=' ')
				System.out.println(a[i]+" is duplicate");
			a[i]=' ';
		}
	}

}
