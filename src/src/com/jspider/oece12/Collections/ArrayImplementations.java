package src.com.jspider.oece12.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayImplementations {
	private Object[] arr;
	private int count = 0;

	public ArrayImplementations()// constructor
	{
		this(10);// calling same class constructor
	}

	// parameterized constructor
	public ArrayImplementations(int defaultSize) {
		// creating an object of array with size of 10, thats default size in array
		arr = new Object[defaultSize];
		System.out.println("initial size of array is:" + arr.length);
	}

	// add methods used to add element as object
	public void add(Object argo) {
		if (count <= arr.length)
			increase();
		arr[count++] = argo;// adding an object at count index
	}

	// this method is used to get element as object
	public Object get(int index) {
		// Exception if index size is greater than the size of an array
		if (index >= size())
			throw new IndexOutOfBoundsException();
		return arr[index];// Returning the array of particular index.
	}

	// this method will return how many element are added
	public int size() {
		return count;
	}

	// execute if objecct of this class is printed
	public String toString() {
		if (size() == 0)
			return "[]";// []if no element
		String s = "[" + arr[0];
		for (int i = 1; i < size(); i++)
			s = s + "," + arr[i];
		return s + "]";
	}

	private void increase() {
		Object[] temp = new Object[(arr.length * 3 / 2) + 1];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}
}
