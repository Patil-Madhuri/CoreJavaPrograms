package inheritance;

 class A {
	A()
	{
		System.out.println("Parent Constructor");
	}
	void m1()
	{
		System.out.println("Parent Method");
	}
 }
	 public class BDemo extends A
	{
		 BDemo()
		{
			System.out.println("Child Constructor");
		}
		void m2()
		{
			System.out.println("Child Method");
		}
		public static void main(String args[])
		{
			BDemo b = new BDemo();
			b.m1();
			b.m2();
		}
}
