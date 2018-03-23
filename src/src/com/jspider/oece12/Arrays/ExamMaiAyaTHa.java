package com.jspider.oece12.Arrays;

public class ExamMaiAyaTHa {

	public static void main(String[] args) {
		int []a={2,3,4,2,3,5,7,6,8,0};
		int fir=0;
		for (int i = 0; i < a.length; i++) 
		{
			int lenght=1;
			while (i<a.length-1&&a[i]<a[i+1]) 
			{
				System.out.print(a[i]+",");
				i++;
				lenght++;
			}
			System.out.print(a[i]+"}");
			if(fir<lenght)
				fir=lenght;
			System.out.println();
		}
		System.out.println("biggest arrays first element is:"+a[fir-1]);
	}

}
