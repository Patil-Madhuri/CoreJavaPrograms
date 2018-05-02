package java8features;
interface X
{
	void m1();
	default void m2()
	{
		System.out.println("Hi......");
	}
	static void m3()
	{
		System.out.println("Hello...");
	}
	default int m4()
	{
		System.out.println("fdshfz");
		return 0;
	}
	
}
public class Interface implements X 
{
public static void main(String[] args) 
{
	Interface a = new Interface();
	a.m1();
	a.m2();
	a.m4();
	X.m3();
}

@Override
public void m1() 
{
System.out.println("Hiii...");
	
}
}