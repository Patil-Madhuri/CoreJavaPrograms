package constructor;

public class StaticDemo1
{
	int a = 10;
	static void m1()
	{
		StaticDemo1 s1 = new StaticDemo1();
		System.out.println(s1.a);
	}
	
	public static void main(String[] args) 
	{
		StaticDemo1 s = new StaticDemo1();
		System.out.println(s.a);
		s.m1();
	}

}
