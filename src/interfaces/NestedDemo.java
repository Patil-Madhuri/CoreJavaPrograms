package interfaces;

interface A1
{
	void m1();
	interface B
	{
		void m2();
	}
}
public class NestedDemo implements A1.B, A1 
{
	public void m1()
	{
		System.out.println("Hi...");
	}
	public void m2()
	{
		System.out.println("Hello...");
	}
	public static void main(String[] args) 
	{
		A1.B b = new NestedDemo();
		b.m2();			
	}
}
