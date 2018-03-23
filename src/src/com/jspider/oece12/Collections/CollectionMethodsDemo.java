package com.jspider.oece12.Collections;

import java.util.ArrayList;

public class CollectionMethodsDemo {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		ArrayList b=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);//10,20,30,40
		int s=a.size();
		System.out.println(a+"\nsize="+s);
		b.addAll(a);
		System.out.println("b"+b);
		boolean t=b.isEmpty();
		boolean ta=a.isEmpty();
		System.out.println(t);//false
		System.out.println(ta);//false
		boolean r=a.contains(40);
		boolean i=a.contains(50);
		System.out.println(r);//true
		System.out.println(i);//false
		boolean f=a.containsAll(b);
		System.out.println(f);//true
		b.add(60);
		b.add(100);
		System.out.println(b);
		System.out.println(a.containsAll(b));//false
		a.remove(1);
		System.out.println(a);
		boolean h=b.retainAll(a);
		System.out.println(h+""+b);
		a.clear();
		System.out.println(a);
		System.out.println(a.isEmpty());//true
		Object[]j=b.toArray();
		System.out.println(j[0]+""+j[1]);
		int p=(int)j[0]+20;
		System.out.println(p);//30
		a.add(0,55);
		a.add(1, 33);
		a.add(2, 44);
		b.add(2, 55);
		System.out.println(b.remove(0)+""+b);
		//System.out.println(oo);
		//System.out.println(a+"\n"+b);
		System.out.println(b.get(2));//
		System.out.println(b.set(0, 10));//
		System.out.println(b);
		System.out.println(b.set(0, 20));//10
		System.out.println(b);
		System.out.println(b.indexOf(20));//0

		
		
		
	}

}
