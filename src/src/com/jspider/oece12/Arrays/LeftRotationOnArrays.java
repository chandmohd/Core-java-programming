package src.com.jspider.oece12.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class LeftRotationOnArrays {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};//2,3,4,5,1
		System.out.println("arrays before left rotation....\n"+Arrays.toString(arr));
		int d=4;
		System.out.println("arrays after rotation....\n"+Arrays.toString(rotateArray(arr,d)));
		
	}
	public static int[] rotateArray(int arr[],int d)
	{
		int n=arr.length;
		int brr[]=new int[n];
		System.arraycopy(arr, d, brr, 0, n-d);
		System.arraycopy(arr, 0, brr, n-d, d);
		return brr;
	}

}
