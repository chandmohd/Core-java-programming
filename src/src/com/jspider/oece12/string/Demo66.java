package com.jspider.oece12.practice;

class N
{
	int a=10;
	
}
class M extends N
{
	int a=20;
}
public class Demo66 {
	public static void main(String[] args) {
		N n1=new N();
		System.out.println(n1.a);//10
		n1=new M();
		System.out.println(n1.a);//10
	}

}
