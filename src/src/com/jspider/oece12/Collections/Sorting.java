package com.jspider.oece12.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(9);
		list.add(34);
		list.add(22);
		list.add(10);
		list.add(9);
		list.add(34);
		list.add(22);
		list.add(10);
		list.add(22);
		Collections.sort(list);
		System.out.println(list);
	}

}
