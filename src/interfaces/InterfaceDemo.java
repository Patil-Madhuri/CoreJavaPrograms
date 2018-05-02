package interfaces;

interface Sample
{
	void m1();
	int a=10;
}
public class InterfaceDemo implements Sample 
{
	public void m1()
	{
		System.out.println("Hi....");
	}
	void m2()
	{
		System.out.println("Hello...");
	}
	public static void main(String[] args) 
	{
		InterfaceDemo d = new InterfaceDemo();
		d.m1();
		d.m2();
	}
}
