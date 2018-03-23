package src.com.jspider.oece12.Arrays;

import java.util.Arrays;

public class FrequentElement {

	public static void main(String[] args) {
		frequentElement(new int [] {1,2,2,3,3});
		
	}
	public static void frequentElement(int arr[])
	{
		int temp[]=new int [arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
			temp[arr[i]]++;
		Arrays.sort(temp);
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]>1)
		     System.out.println("most frequent element:"+temp[arr[i]]);
			else
				System.err.println("no frequent element ");
		}
			
				
	}
}
