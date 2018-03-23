package com.jspider.oece12.Number;

import java.util.Scanner;

public class HexatoDeci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the hexadecimal no...");
		int no=Integer.parseInt(sc.nextLine(),8);
		System.out.println(no);
		
	}

}
