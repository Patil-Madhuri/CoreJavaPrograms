package trickyprograms;

class  Parent
{
	Parent(int id)
	{
		System.out.println("1");
	}
	Parent()
	{
		System.out.println("0");
	}
	
}
public class Child  extends Parent
{
	Child(int id, String name)
	{
		System.out.println("2");
	}
	
	public static void main(String[] args) 
	{
		Child c = new Child(10,"aa");
	}
}
