package src.com.jspider.oece12.string;

import java.util.Arrays;
import java.util.Scanner;

public class SplitString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String to split/n");
		String normal = scanner.nextLine();
		String[] splitString = splitString(normal);
		System.out.println(Arrays.toString(splitString));
	}

	private static String[] splitString(String normal) {
		String[] splitString = new String[spaceCount(normal) + 1];
		char charArray[] = normal.toCharArray();
		String temp = "";
		int j = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ') {
				temp += charArray[i];
			} else {
				splitString[j++] = temp;
				temp = "";
			}
		}
		splitString[j++] = temp;

		return splitString;
	}

	private static int spaceCount(String normal) {
		int space = 0;
		for (int i = 0; i < normal.length(); i++) {
			if (normal.charAt(i) != ' ');
			else
				space++;
		}
		return space;
	}

}
