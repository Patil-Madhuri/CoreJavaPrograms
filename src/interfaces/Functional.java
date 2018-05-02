package interfaces;

interface RBI
{
	void interest();
}

class BOI implements RBI
{
	public void interest()
	{
		System.out.println("Rate of interest of BOI");
	}
	
}
class SBI implements RBI
{
	public void interest()
	{
		System.out.println("Rate of interest of SBI");
	}
}
class ICICI implements RBI
{
	public void interest()
	{
		System.out.println("Rate of interest of ICICI");
	}
	
}

public class Functional 
{
	public static void main(String[] args) 
	{
		RBI r = new ICICI();
		r.interest();
		
		System.out.println("\nSBI");
		RBI s = new SBI();
		s.interest();
		
	}
}

