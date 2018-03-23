package src.com.jspider.oece12.Collections;

import java.util.LinkedList;
/*
 * Implementation of singly linked list*
 * author Chand mohd
 */

interface LinkedList1
{
	public void add(Object element);
	public void remove(Object element);
	public void add(int index, Object element);
	public Object get(int index);
	public Object set(int index, Object element);
	public int indexOf(Object element);
	public void clear();
	public int size();
	
}
public class LinkedListImp implements LinkedList1 {
	
	private Node first;
	private Node last;
	private static int count;
	
	private static  class Node
	{
		Object ele;
		Node next;

		public Node(Object ele) {
			this.ele = ele;
			count++;
		}
	}

	@Override
	public void add(Object element) {
		if (first == null) {
			first = new Node(element);
			last = first;
			return;
		}
		last.next = new Node(element);
		last = last.next;
	}

	@Override
	public void remove(Object element) {
		Node old = null;
		Node temp = first;

		while (temp != null) {
			if (temp.ele == element) {
				if (temp == first)
					first = temp.next;
				else
					old.next = temp.next;
				temp =temp.next;
			} else {
				old = temp;
				temp = temp.next;
			}
		}
	}
	
	@Override
	public void add(int index, Object element) {
		Node temp = first;
		for(int i= 0;i<=index;i++)
		{
			
		}
		
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		return count;
	}
	@Override
	public String toString()
	{
		Node temp = first;
		String string = "["+temp.ele;
		while(temp.next!= null)
		{
			temp = temp.next;
			string+=","+temp.ele;
		}
		return string+"]";
	}

}
