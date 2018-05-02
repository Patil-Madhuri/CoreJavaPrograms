package trickyprograms;

public class Staticproof2 {
	static int a,b;
	static
	{
		a = 10;
		b = 20;
	}
	static
	{
		a = 100;
		b = 200;
	}
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
	}

}
