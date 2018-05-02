package constructor;

public class InitializarBlock {
	static{
		System.out.println("Welcome....");
	}
	{
		System.out.println("Block1....");
	}
	{
		System.out.println("Block2....");
	}
	{
		System.out.println("Block3....");
	}
	
	InitializarBlock()
	{
		System.out.println("Zero Parameter constructor");
	}
	
	InitializarBlock(int a)
	{
		System.out.println("One Parameter constructor");
	}
	
	InitializarBlock(int a, int b)
	{
		System.out.println("Two Parameter constructor");	
	}
	
	public static void main(String args[])
	{
		InitializarBlock i = new InitializarBlock();
		InitializarBlock i1 = new InitializarBlock(10);
		InitializarBlock i2 = new InitializarBlock(10,20);
	
	}

}
