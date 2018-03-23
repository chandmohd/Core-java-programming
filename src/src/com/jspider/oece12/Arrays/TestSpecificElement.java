package com.jspider.oece12.Arrays;
public class TestSpecificElement {

	public static void main(String[] args) {
		int[]a={1020,2003,2004,2005,2006,2007,2017};
		System.out.println("Specific element\n"+a[0]+" "+contain(a,1020));
		//System.out.println("Specific element\n"+contain(a,1000));
		
	}
	public static boolean contain(int[]a,int item) 
	{
	for (int n:a) 
	{
		if(n==item) return true;
	}	
	return false;
	}

}
