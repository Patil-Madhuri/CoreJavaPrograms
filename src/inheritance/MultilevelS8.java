package inheritance;

class S6
{
	void sms()
	{
		System.out.println("SMS");
	}
	void calling()
	{
		System.out.println("Calling");
	}
}
	class S7 extends S6
	{
		void camera()
		{
			System.out.println("camera");
		}
		void Twog()
		{
			System.out.println("2G");
		}
		void calling()
		{
			System.out.println("Calling1");
		}
	}
	public class MultilevelS8 extends S7 {
		void fourG()
		{
		System.out.println("4G");
		}
		void touchScreen()
		{
			System.out.println("touchScreen");
		}
		void calling()
		{
			System.out.println("Calling2");
		}
	public static void main(String[] args) {
		MultilevelS8 m = new MultilevelS8();
		m.sms();
		m.calling();
		m.camera();
		m.fourG();
	}

}
