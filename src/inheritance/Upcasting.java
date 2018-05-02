package inheritance;

class Parent3
{
	void m1()
	{
		System.out.println("Own method: Parent");
	}
	void m2()
	{
		System.out.println("Common method:Parent");
	}
}

public class Upcasting extends Parent3
{
	void m2()
	{
		System.out.println("Common method:Child");
	}
	void m3()
	{
		System.out.println("Own method: Child");
	}
	
	public static void main(String[] args) 
	{
		//Parent3 p = new Upcasting();
		
		/*p.m1();							//upcasting
		p.m2();
		*/
		//Upcasting u =  new Parent3();					// upcasting error 
		//Upcasting u = (Upcasting) new Parent3();		//Class cast exception
		/*Upcasting u = (Upcasting)p;  					// downcasting
		u.m1();
		u.m2();
		u.m3();*/
		Parent3 p = new Parent3();						//Dynamic method dispatchs
		p.m2();
		p.m1();
		
		p = new Upcasting();
		p.m2();
		
	}
}
