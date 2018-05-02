package constructor;

public class Parameter {
	Parameter()
	{
		System.out.println("Zero Parameter Constructor");
	}

	Parameter(int a)
	{
		System.out.println("One Parameter Constructor");
	}
	Parameter(int a, int b)
	{
		System.out.println("Two Parameter Constructor");
	}
	Parameter(int a, int b, int c)
	{
		System.out.println("Three Parameter Constructor");
	}

public static void main(String args[])
{
	Parameter d= new Parameter();
	Parameter d1 = new Parameter(10);
	Parameter d2 = new Parameter(10,20);
	Parameter d3 = new Parameter(10,20,30);
}
}
