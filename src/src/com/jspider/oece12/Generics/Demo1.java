package com.jspider.oece12.Generics;

public class Demo1 {

	public static void main(String[] args) {
		GenericsDemo1<String> getname=new GenericsDemo1<String>("chand");
		getname.printype();
		GenericsDemo1<Boolean>b=new GenericsDemo1<Boolean>(Boolean.TRUE);
		b.printype();
		GenericsDemo1<Integer>i=new GenericsDemo1<Integer>(10);
		i.printype();
	}

}
class GenericsDemo1<C>
{
	private C obj=null;
	public GenericsDemo1( C para) 
	{
		this.obj=para;
	}
	public C getObj() 
	{
		return this.obj;
	}
	public void  printype() 
	{
		System.out.println("type:"+obj.getClass().getName());
	}
}
