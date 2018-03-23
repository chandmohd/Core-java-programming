package com.jspider.oece12.Arrays;

import java.util.Arrays;

public class SortingArrays {
	public static void main(String[] args) {
		int[]arr={1234,4567,7890,23,45,55,12,20,2,3,5};
		String[]srr={"chand","mohd","c","java"};
		System.out.println("original array:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("sorted arrays:"+Arrays.toString(arr));
		System.out.println("original string array:"+Arrays.toString(srr));
		Arrays.sort(srr);
		System.out.println("sorted string arrays:"+Arrays.toString(srr));
	}

}
