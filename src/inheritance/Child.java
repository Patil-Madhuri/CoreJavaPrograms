package inheritance;

class Parent
{
	void m1()
	{
		System.out.println("M1 Method");
	}
}
public class Child extends Parent {
	void m2()
	{
		System.out.println("M2 Method");
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
		
	}

}
