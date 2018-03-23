package com.jspider.oece12.Arrays;

public class FindTheLargestNumberLessThanGivenNumber {

	public static void main(String[] args) {
		System.out.println("enter the number..");
		int n = getLessThanN(254, 5);// 249
		System.out.println(n);
		for(int i=0;;++i)
		{
			System.out.println("chand"); 
		}
	}

	public static int getLessThanN(int num, int digit) {
		char c = Integer.toString(digit).charAt(0);
		for (int i = num; i >= 0; i--) {
			if (Integer.toString(i).indexOf(c) == -1) {
				return i;
			}
		}
		return -1;

	}

}
