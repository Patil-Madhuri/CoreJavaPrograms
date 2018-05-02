package java8features;
interface A
{
	void m1();
}
interface B 
{
	void m2();
}
public class Lambda 
{
	public static void main(String[] args) 
	{
		int a=10;
		A obj=()->
		{
			System.out.println("Hiii" +a);
		};
		obj.m1();
		B obje=()->
		{
			System.out.println("Hello" +a);
		};
		obje.m2();
	}
}
