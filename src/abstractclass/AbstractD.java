package abstractclass;

abstract class AbstractD 
{
	abstract void a();
	static void p()
	{
		System.out.println("Method P");
	}
	
	public static void main(String[] args) 
	{
		//AbstractD a = new AbstractD();  we can't create instance of abstract class
		p();
	}
}
