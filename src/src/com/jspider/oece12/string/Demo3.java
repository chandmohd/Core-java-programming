package com.jspider.oece12.practice;

import java.util.Arrays;
public class Demo3 {
	public static void main(String[] args) {
		System.out.println("enter the string...");
		int[]arr={1,2,3,4,5,6};
		int[]bee={7,8,9,10,11};
		int[]brr=new int[arr.length+bee.length];
		System.arraycopy(arr, 0, brr, 0, arr.length);
		System.arraycopy(bee, 0, brr, arr.length, bee.length);
		System.out.println("brr:"+Arrays.toString(brr));
	}
		


}
