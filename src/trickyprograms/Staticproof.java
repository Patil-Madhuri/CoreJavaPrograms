package trickyprograms;

public class Staticproof {
	static int counter = 0;
	Staticproof()
	{
		counter++;
		System.out.println(counter);
	}
	public static void main(String[] args) 
	{
		Staticproof d = new Staticproof();
		Staticproof d1 = new Staticproof();
}
}
