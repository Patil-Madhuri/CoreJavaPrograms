package interfaces;

interface Mobile
{
	void calling();
	void sms();
	default void fourG()   // error:abstract method does not specify body
	{
		System.out.println("Four G");
	}
}

class Samsung implements Mobile
{
	public void calling()
	{
		System.out.println("Samsung: Calling");
	}
	public void sms()
	{
		System.out.println("Samsung: SMS");
	}
}

public class Nokia implements Mobile
{
	public void calling()
	{
		System.out.println("Nokia: Calling");
	}
	public void sms()
	{
		System.out.println("Nokia: SMS");
	}
	
	public static void main(String[] args)
	{
		Mobile m = new Nokia();
		m.calling();
		m.sms();
		m.fourG();
	}
}
