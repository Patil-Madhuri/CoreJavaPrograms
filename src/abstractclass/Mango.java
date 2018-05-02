package abstractclass;

public class Mango extends Fruits
{
	Mango(String color, String seasonal)
	{
		super(color,seasonal);
	}
	void serve()
	{
		System.out.println("Cut it and then Serve");
	}
	public static void main(String[] args) 
	{
	Mango m = new Mango("Yellow","Seasonal");
	
	System.out.println(m.color);
	System.out.println(m.seasonal);
	m.serve();
	}

}
