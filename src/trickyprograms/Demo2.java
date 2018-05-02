package trickyprograms;

public class Demo2 
{
	int counter = 0;
	Demo2()
	{
		counter++;
		System.out.println(counter);
	}
	public static void main(String[] args) 
	{
		Demo2 d = new Demo2();
		Demo2 d1 = new Demo2();
}
}
