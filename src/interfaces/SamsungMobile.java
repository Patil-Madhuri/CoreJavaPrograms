package interfaces;

interface Mobile1
{
	void calling();
	void sms();
}

class NewSamsung
{
	void ThreeG()
	{
		System.out.println("ThreeG");
	}
}
public class SamsungMobile extends NewSamsung implements Mobile1 
{
	public void calling()
	{
		System.out.println("Calling");
	}
	public void sms()
	{
		System.out.println("SMS");
	}
	public static void main(String[] args) 
	{
		SamsungMobile s = new SamsungMobile();
		s.calling();
		s.sms();
		s.ThreeG();
	}
}
