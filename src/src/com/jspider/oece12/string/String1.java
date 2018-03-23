package com.jspider.oece12;

public class String1 {

	public static void main(String[] args) {
		String s=new String("Java");
		String s1="java";
		String s2="java";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s1.indexOf("va",1));
		System.out.println(s.equals(s1));//false
		System.out.println(s1==s);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2);//true
		System.out.println(s2.indexOf('a'));//1
		System.out.println(s.substring(2));//va
		System.out.println(s.substring(1,3));//av
		System.out.println(s1.substring(1,3).charAt(1));//v
		//System.out.println(s1.replace('j', 'a'));//aava
		






	}

}
