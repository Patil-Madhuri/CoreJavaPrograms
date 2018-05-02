package abstractclass;

public class Banana extends Fruits
{
	Banana(String color,String seasonal)
	{
		super(color,seasonal);
	}
	@Override
	void serve()
	{
		System.out.println("Peal it and then serve");
	}
	
	public static void main(String[] args) 
	{
		Banana b = new Banana("Yellow","Seasonal");
		System.out.println(b.color);
		System.out.println(b.seasonal);
		b.serve();
	}
}
