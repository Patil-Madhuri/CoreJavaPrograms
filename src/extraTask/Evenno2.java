package extraTask;
import java.util.Scanner;

public class Evenno2 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("No is even");
		}
		else
		{
			System.out.println("No is odd");
		}
	}

}
