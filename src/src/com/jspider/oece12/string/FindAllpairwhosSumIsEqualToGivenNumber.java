package com.jspider.oece12;

import java.util.Scanner;

public class FindAllpairwhosSumIsEqualToGivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enterthe number...");
		int number=sc.nextInt();
		int[]arr={4,5,7,11,9,13,8,12};
		for (int i = 0; i < arr.length; i++) {
			int ele=arr[i];
			for (int j = 1; j < arr.length; j++) {
				if (ele+arr[j]==number) 
				{
					System.out.print(ele+","+arr[j]+" ");
					i++;
				}
			}
		}
	}

}
