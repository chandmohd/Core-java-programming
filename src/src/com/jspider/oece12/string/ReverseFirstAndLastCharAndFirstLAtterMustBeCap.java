package com.jspider.oece12;

public class ReverseFirstAndLastCharAndFirstLAtterMustBeCap {

	public static void main(String[] args) {
		String []s={"chand"};//Dhanc
		for(int i=0;i<s.length;i++)
		{
			char[]c=s[i].toCharArray();
				c[0]=(char)(c[i]-32);
				c[c.length-1]=(char)(c[c.length-1]-32);
				c[0]=(char) (((char)c[c.length-1]+c[0])-((char)(c[c.length-1]=c[0])));
				s[i]=new String(c);
				System.out.println(s[i]);
			}
		}
	}

