package com.jspider.oece12.Arrays;
import java.util.Arrays;

public class InsertingElement {

	public static void main(String[] args) {
		int[]a={1,2,3,4,5,6};
		System.out.print("array before adding element:"+Arrays.toString(a));

		int[]b=new int[a.length+1];
		int index=3;
		int ele=10;
		int i;
		for (i = 0; i < index; i++) 
		{
			b[i]=a[i];
		}
		b[i]=ele;
		for(i=index;i<a.length;i++)
			b[i+1]=a[i];
		System.out.print("\narray after adding"+ele+"element:"+Arrays.toString(b));
		
	}
}
	

