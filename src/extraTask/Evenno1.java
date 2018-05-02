package extraTask;
import java.util.Scanner;

public class Evenno1 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number=");
		int num = s.nextInt();
		/*
		if(num / 2 *2==num)
		{
			System.out.println("No is Even");
		}
		else
		{
			System.out.println("No is odd");
		}*/
		while(num != 0)
		{
			num = num - 2;
		}
		if(num == 0)
		{
			System.out.println("No is Even");
		}
		 else
		 {
			System.out.println("No is odd");
		 }
	}
}
