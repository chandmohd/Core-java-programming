package src.com.jspider.oece12.string;

import java.util.Arrays;
import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string..");
		String str = sc.nextLine();
		String[] srr = split(str);
		System.out.println(Arrays.toString(srr));
	}

	public static String[] split(String str) {
		int space = 0;
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) == ' ')
				space++;
		String s[] = new String[space + 1], temp = "";
		for (int i = 0, j = 0; i <= str.length() - 1; i++) 
		{
			if (str.charAt(i) == ' ') 
			{
				s[j++] = temp;
				temp = "";
			} 
			else
			{
				temp += str.charAt(i);
			}
			s[j] = temp;
		}
		return s;

	}

}
