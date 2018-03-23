package com.jspider.oece12;

import java.util.Arrays;

public class AnagramUsingBuiltingMethod {
	public static void isAnagram(String s1,String s2)
	{
		 boolean res=true;
		String str=s1.replaceAll("\\s", "").toLowerCase();
		String str1=s2.replaceAll("\\s", "").toLowerCase();
		char[]c1=str.toCharArray();
		char[]c2=str1.toCharArray();
		if(str.length()!=str1.length())
			res=false;
		Arrays.sort(c1);
		Arrays.sort(c2);
		res=Arrays.equals(c1, c2);
		if(res)
			System.out.println(s1+" and "+s2+" are anagram");
		else
			System.out.println(s1+" and " +s2+" are not anagram");	
	}

	public static void main(String[] args) {
		isAnagram("chand", "mohd");//not anagram
		isAnagram("cat", "TAc");//anagram
		isAnagram("Mother In Law", "Hitler Woman");//anagram
		
	}

}
