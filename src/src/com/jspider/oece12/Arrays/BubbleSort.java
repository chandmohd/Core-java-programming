package com.jspider.oece12.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("enter the size od an array...");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		Arrays.c
		System.out.println("entr the number in array;...");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		bubble(a);
		System.out.println("soarted arrays is:" + Arrays.toString(a));
	}

	public static void bubble(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1])
					a[j] = a[j] + a[j + 1] - (a[j + 1] = a[j]);
			}
		}
	}

}
