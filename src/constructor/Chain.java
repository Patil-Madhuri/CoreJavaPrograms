package constructor;

public class Chain {
	Chain()
	{
		this(10);
		System.out.println("Zero");
	}
	Chain(int a)
	{
		this(10,20);
		System.out.println("One");
	}
	Chain(int a, int b)
	{
		this(10,20,30);
		System.out.println("Two");
	}
	Chain(int a, int b, int c)
	{
		
		System.out.println("Three");
	}
	public static void main(String args[])
	{
		Chain d = new Chain();
	}

}
