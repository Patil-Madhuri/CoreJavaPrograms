package abstractclass;

abstract class A
{
	abstract void a();
	abstract void b();
}

abstract class B extends A
{
	@Override
	void a()
	{
		System.out.println("method A");
	}
	abstract void c();
}

abstract class C1 extends B
{
	
}
public class Demo extends C1
{
	void b()
	{
		System.out.println("method b");
	}
	void c()
	{
		System.out.println("method c");
	}
	
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		d.a();
		d.b();
		d.c();
	}
}
