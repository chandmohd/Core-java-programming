package com.jspider.oece12.practice;
public class Demo09 {
	public static void main(String[] args) {
		int alpha=1;
		int m=99;
		int space=2;
		char u='i';
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int k=space;k>=1;k--)
				System.out.print(" ");
			for(int j=1;j<=alpha;j++)
			{
				if(i==1&&j==1||i==5)
				{
					System.out.print(u);
					break;
				}
				if(j==1||j==alpha)
					System.out.print((char)m);
				else
					System.out.print(" ");
			}
			if(i>=3)
			{
				alpha-=2;
				space++;
				m++;
			}
			else
			{
			alpha+=2;
			space--;
			m--;
			}
			System.out.println();
		}
	}

}
