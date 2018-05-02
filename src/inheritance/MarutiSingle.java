package inheritance;

	class Car
	{
		void speed()
		{
			System.out.println("speed20");
		}
		void gear() 
		{
			System.out.println("gear");
		}
	}

	public class MarutiSingle extends Car {
			void color()
			{
				System.out.println("color");
			}
			void avespeed()
			{
				System.out.println("avespeed");
			}
			void speed()
			{
				System.out.println("speed80");
			}
			public static void main(String[] args) {
				MarutiSingle m = new MarutiSingle();
				m.speed();
				m.color();
			} 
		}
