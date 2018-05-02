package interfaces;

interface A
{
	void m1();
}

interface B extends A
{
	void m2();
}

public class ExtendedDemo implements B 
{
	public void m1()
	{
		System.out.println("Hii...");
	}
	public void m2()
	{
		System.out.println("Hello...");
	}
	public void m3()
	{
		System.out.println("Thanks");
	}
	public static void main(String[] args)
	{
     ExtendedDemo b = new ExtendedDemo();
     b.m1();
     b.m2();
     b.m3();
	}
}
