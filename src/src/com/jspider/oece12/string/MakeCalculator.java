package com.jspider.oece12.practice;

import java.awt.Choice;
import java.util.Scanner;

public class MakeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a,b,res;
		int choice;
		do
		{
			System.out.print("1.Additon\n");
			System.out.print("2.Subtraction\n");
			System.out.print("3.multiplication\n");
			System.out.print("4.division\n");
			System.out.print("5.exit\n");
			System.out.print("enter your choice...");
			 choice=sc.nextInt();
			switch (choice) 
			{
			case 1:System.out.print("enter the two number:");
			a=sc.nextFloat();
			b=sc.nextFloat();
			res=a+b;
			System.out.print("result:"+res);
				break;
			case 2:System.out.print("enter two number:");
			a=sc.nextFloat();
			b=sc.nextFloat();
			res=a-b;
			System.out.print("result:"+res);
			break;
			case 3:System.out.print("enter two number:");
			a=sc.nextFloat();
			b=sc.nextFloat();
			res=a*b;
			System.out.print("result:"+res);
			break;
			case 4:System.out.print("enter two number:");
			a=sc.nextFloat();
			b=sc.nextFloat();
			res=a/b;
			System.out.print("result:"+res);
			break;
			case 5:System.exit(0);
			break;
			
			default:System.out.print("wrong choice..!!!");
				break;
			}
			System.out.print("\n--------------------------\n");
		}while(choice!=5);
		
	}

}
