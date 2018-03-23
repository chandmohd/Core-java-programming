package com.jspider.oece12;

public class ArrangingWordsInAlphabaticalOrder {

	public static void main(String[] args) {
		String s="chand mohd";
		char[] a=s.toCharArray();
		sort(a);
		for(char aa:a)
		{
			System.out.print(aa+"");
		}
	}
		public static void sort(char[] a)
		{
		for (int i = 0; i < a.length; i++) 
		{
			char key=a[i];
			int j=i-1;
			while(j>-1&&a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

}
