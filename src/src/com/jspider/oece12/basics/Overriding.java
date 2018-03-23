package src.com.jspider.oece12.basics;
class A{
	public void print()
	{
		System.out.println("class A");
	}
}

class B extends A{
	@Override
	public void print()
	{
		System.out.println("class B");
	}
}

class C extends A{
	public void print()
	{
		System.out.println("class C");
	}
}
public class Overriding {
	public static void main(String[] args) {
		A a=new A();
		a.print();//class A
		
		A a1 = new B();
		a1.print();//class B
		
		A a2=new C();
		a2.print();//class C
	
	}

}
