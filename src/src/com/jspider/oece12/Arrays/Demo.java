package com.jspider.oece12.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int []arr={2,3,4,2,1};
		int a0=1,a1=1,a2=2;
		int A[]={a0,a1,a2};
		return A,arr;
		int []brr=new int[arr.length];
		int len =brr.length;
		System.arraycopy(arr, 0, brr, 0, brr.length);
		System.out.println(Arrays.toString(brr));
				
				
	}

}
