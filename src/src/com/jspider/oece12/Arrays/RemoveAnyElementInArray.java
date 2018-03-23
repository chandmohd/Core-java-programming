package com.jspider.oece12.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class RemoveAnyElementInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array..");
		int arr[]=new int [sc.nextInt()];
		System.out.println("enter the elemrnt ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println(Arrays.toString(arr));
		System.out.println("enter the index to remove");
	    int b[]=remove(arr, sc.nextInt());
		System.out.println(Arrays.toString(b));
	}
	public static int [] remove(int a[],int index)
	{
		int b[]=new int[a.length-1];
		for(int i=0;i<index;i++)
			b[i]=a[i];
		for(int i=index+1;i<a.length;i++)
			b[i-1]=a[i];
		return b;
	}
}


